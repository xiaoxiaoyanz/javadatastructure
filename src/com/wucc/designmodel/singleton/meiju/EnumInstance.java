package com.wucc.designmodel.singleton.meiju;

public enum EnumInstance {
	
	INSTANCE{
        protected  void printTest(){
            System.out.println("redstar Print SingletonTest");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
