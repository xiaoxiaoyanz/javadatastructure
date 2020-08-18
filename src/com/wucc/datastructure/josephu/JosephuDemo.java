package com.wucc.datastructure.josephu;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-07-31 15:27
 */
public class JosephuDemo {

	private static Boy first = null;

	//生成一个环形列表
	private static void addNode(int number){
		if(number < 1){
			System.out.println("请输入正确的起始值");
			return;
		}

		Boy curBoy = null;
		for(int i = 1;i <= number;i++){
			Boy boy = new Boy(i);
			if(1 == i){
				first = boy;
				first.setNext(boy);
				curBoy = boy;
			}else{
				curBoy.setNext(boy);
				boy.setNext(first);
				curBoy = boy;
			}
		}
	}

	//遍历节点
	private static void show(){
		if(null == first){
			System.out.println("链表为空");
			return;
		}
		Boy curBoy = first;
		while (true){
			System.out.println("节点的编号是:"+curBoy.getNumberNo());
			if(curBoy.getNext() == first){
				break;
			}
			curBoy = curBoy.getNext();
		}
	}

	//计算出圈的节点
	public void getCurNode(int startNo,int count,int number){
		if(startNo < 1 || startNo > number || count < 0){
			System.out.println("输入参数有误");
			return;
		}
		//创建一个环形链表
		addNode(number);
		show();

		//计算出圈的节点
		//创建帮助节点
		Boy helper = first;
		//将helper指向最后一个节点
		while (true){
			if(helper.getNext() == first){
				break;
			}
			helper = helper.getNext();
		}
		//将helper、first移动startNo - 1次，比如从第3个节点开始报数，那么first指向第三个节点
		for (int j = 0;j < startNo - 1;j++){
			first = first.getNext();
			helper = helper.getNext();
		}

		//开始报数
		while (true){
			//此时环形链表中只有一个节点，循环结束
			if(helper == first){
				break;
			}
			//将helper、count - 1次，比如从3开始报数，报到6时出列，那么此时first指向的是报6的节点
			 for(int k = 0;k < count - 1;k++){
			 	first = first.getNext();
			 	helper = helper.getNext();
			 }
			 //输出出圈节点
			 System.out.println("出圈节点："+first.getNumberNo());
			 first = first.getNext();
			 helper.setNext(first);
		}
		System.out.println("最后一个节点是："+first.getNumberNo());

	}

	public static void main(String[] args) {
		JosephuDemo josephuDemo = new JosephuDemo();
		long start = System.currentTimeMillis();
		josephuDemo.getCurNode(2,5,200000);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}


}
