package com.wucc.designmodel.singleton.cas;

import java.util.concurrent.atomic.AtomicReference;

public class CasSingleton {


        private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<CasSingleton>();

        private CasSingleton() {}

        public static CasSingleton getInstance() {
            for (;;) {
                CasSingleton casSingleton = INSTANCE.get();
                if (null != casSingleton) {
                    return casSingleton;
                }

                casSingleton = new CasSingleton();
                if (INSTANCE.compareAndSet(null, casSingleton)) {
                    return casSingleton;
                }
            }
        }

}
