package jqueryTest;
//�����ջ�ͱ��ط���ջ���
//http://blog.csdn.net/hanghangaidoudou/article/details/8363380
//������HotSpot������в������������ջ�ͱ��ط�����ջ����˶���HotSpot��˵��-Xoss(���ñ��ط���ջ��С)��������Ч�ģ�ջ������-Xss�����趨�����������ջ�ͱ��ط�����ջ����Java������淶�������������쳣��
//
//����߳������ջ��ȴ��������������������ȣ����׳�StackOverflowError�쳣
//������������չջʱ�޷����뵽�㹻���ڴ�ռ䣬���׳�OutOfMemoryError�쳣
public class javaVMStackSOF {
	
	private int stackLength = 1;
	private void stackLeak(){
		stackLength++;
		stackLeak();
	}
	public static void main(String[] args) throws Exception {
		javaVMStackSOF oom = new javaVMStackSOF();
		try {
			oom.stackLeak();
		} catch (Exception e) {
			System.out.println("stack length :"+oom.stackLength);
			throw e;
		}
	}

}
