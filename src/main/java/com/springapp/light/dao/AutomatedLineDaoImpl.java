package com.springapp.light.dao;

import com.springapp.light.domain.*;
import com.springapp.mvc.util.PrintInFile;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class AutomatedLineDaoImpl extends PrintInFile implements AutomatedLineDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @SuppressWarnings("unchecked")
    public AutomatedLine getLightByUrl(String url) {
        Query query = sessionFactory.getCurrentSession().createQuery("from AutomatedLine where url='" + url + "'");
        return (AutomatedLine) query.uniqueResult();
    }

    @Override
    @SuppressWarnings("unchecked")
    public AutomatedLine getLightById(int id) {
//        return (AutomatedLine) sessionFactory.getCurrentSession().createQuery("from AutomatedLine where model_en LIKE '%" + id + "%' ORDER BY model_en DESC").list().get(0);
        Query query = sessionFactory.getCurrentSession().createQuery("from AutomatedLine where id=" + id + "");
        return (AutomatedLine) query.uniqueResult();
    }

    //       ORDER BY model DESC

    @Override
    @SuppressWarnings("unchecked")
    public void saveAutomatedLine(AutomatedLine AutomatedLine) {
        sessionFactory.getCurrentSession().saveOrUpdate(AutomatedLine);
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<AutomatedLine> getListAutomatedLine() {
        List<AutomatedLine> list = sessionFactory.getCurrentSession()
                .createCriteria(AutomatedLine.class).list();
        return list;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<AutomatedLine> getListAutomatedLine(String emergency, String[] arrPowers, String size, String type) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(AutomatedLine.class);
        if (emergency != null) crit.add(Restrictions.ne("luminousFluxEmergency", 0));
        if (arrPowers != null && !arrPowers[0].equals("")) crit.add(Restrictions.in("power", arrPowers));
        if (size != null && !size.equals("")) crit.add(Restrictions.eq("size", size));
        if (type != null && !type.equals("")) crit.add(Restrictions.eq("type", type));
        return crit.list();
    }


//    @Override
//    @SuppressWarnings("unchecked")
//    public void renewAutomatedLinePower() {
//        renewLightFilter(AutomatedLinePower.class.getSimpleName(), "office", "power");
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public void renewAutomatedLineSize() {
//        renewLightFilter(AutomatedLineSize.class.getSimpleName(), "office", "size");
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public void renewAutomatedLineType() {
//        renewLightFilter(AutomatedLineType.class.getSimpleName(), "all", "type");
//    }


    @Override
    @SuppressWarnings("unchecked")
    public List<AutomatedLine> getListLighByIds(String[] idsArr) {
        Integer[] idsArrInt = new Integer[idsArr.length];
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(AutomatedLine.class);
        for(int i = 0; i < idsArr.length; i++) {
            idsArrInt[i] = Integer.parseInt(idsArr[i]);
        }
        if (idsArr != null && !idsArr[0].equals("")) criteria.add(Restrictions.in("id", idsArrInt));
        return criteria.list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<AutomatedLine> getListLightFromSearch(String word) {
        return sessionFactory.getCurrentSession().createQuery("from AutomatedLine where model_en LIKE '%" + word + "%' ORDER BY model_en DESC").list();
    }


//    @SuppressWarnings("unchecked")
//    private void renewLightFilter(String className, String typeLight, String checkBoxName) {
//        Session session = sessionFactory.getCurrentSession();
//        session.createQuery("delete from " + className).executeUpdate();
//        List<String> list;
//        if (typeLight.equals("all"))
//            list = session.createQuery("select M." + checkBoxName + " from AutomatedLine M").list();
//        else
//            list = session.createQuery("select M." + checkBoxName + " from AutomatedLine M where type='" + typeLight + "'").list();
//
//
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, list.get(i).toLowerCase());
//        }
//
//        Set<String> set = new HashSet<String>();
//        for (String val : list) {
//            set.add(val);
//        }
//
//        if (className.equals(AutomatedLinePower.class.getSimpleName())) {
//            for (String s : set) {
//                session.save(getAutomatedLinePower((Integer.parseInt(s)), Collections.frequency(list, s)));
//            }
//        } else if (className.equals(AutomatedLineSize.class.getSimpleName())) {
//            for (String s : set) {
//                session.save(getAutomatedLineSize(s, Collections.frequency(list, s)));
//            }
//        } else if (className.equals(AutomatedLineType.class.getSimpleName())) {
//            for (String s : set) {
//                session.save(getAutomatedLineType(s, Collections.frequency(list, s)));
//            }
//        }
//
//
//    }


//    private AutomatedLinePower getAutomatedLinePower(int val, int num) {
//        AutomatedLinePower AutomatedLinePower = new AutomatedLinePower();
//        AutomatedLinePower.setPower(val);
//        AutomatedLinePower.setNum(num);
//        return AutomatedLinePower;
//    }
//
//    private AutomatedLineSize getAutomatedLineSize(String val, int num) {
//        AutomatedLineSize AutomatedLinePower = new AutomatedLineSize();
//        AutomatedLinePower.setSize(val);
//        AutomatedLinePower.setNum(num);
//        return AutomatedLinePower;
//    }
//
//    private AutomatedLineType getAutomatedLineType(String val, int num) {
//        AutomatedLineType AutomatedLineType = new AutomatedLineType();
//        AutomatedLineType.setType(val);
//        AutomatedLineType.setNum(num);
//        return AutomatedLineType;
//    }

}
