package jqueryTest;
//虚拟机栈和本地方法栈溢出
//http://blog.csdn.net/hanghangaidoudou/article/details/8363380
//由于在HotSpot虚拟机中并不区分虚拟机栈和本地方法区栈，因此对于HotSpot来说，-Xoss(设置本地方法栈大小)参数是无效的，栈容量由-Xss参数设定。关于虚拟机栈和本地方法区栈，在Java虚拟机规范中描述了两种异常：
//
//如果线程请求的栈深度大于虚拟机所允许的最大深度，将抛出StackOverflowError异常
//如果虚拟机在扩展栈时无法申请到足够的内存空间，则抛出OutOfMemoryError异常
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
