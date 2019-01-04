package com.supermap.dossiertool.bean;

import com.supermap.dossiertool.smattrEntity.Jsydsyq;
import com.supermap.dossiertool.smattrEntity.Qlr;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:32 2019/1/4 0004
 */
public class QlrAndSyqList {
    private List<QlrAndSyq> qlrAndSyqs = new ArrayList<>();

    public List<QlrAndSyq> getQlrAndSyqs() {
        return qlrAndSyqs;
    }

    public void setQlrAndSyqs(List<QlrAndSyq> qlrAndSyqs) {
        this.qlrAndSyqs = qlrAndSyqs;
    }

//     class QlrAndSyq{
//        private Qlr qlr;
//        private Jsydsyq jsydsyq;
//
//       public Qlr getQlr() {
//           return qlr;
//       }
//
//       public void setQlr(Qlr qlr) {
//           this.qlr = qlr;
//       }
//
//       public Jsydsyq getJsydsyq() {
//           return jsydsyq;
//       }
//
//       public void setJsydsyq(Jsydsyq jsydsyq) {
//           this.jsydsyq = jsydsyq;
//       }
//   }
}
