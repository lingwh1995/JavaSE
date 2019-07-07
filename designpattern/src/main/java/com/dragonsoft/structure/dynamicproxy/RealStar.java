/**  
 * @Title: RealStar.java  
 * @Package com.dragonsoft.structure.staticproxy
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author ronin  
 * @date 2019年3月23日  
 * @version V1.0  
 */ 
package com.dragonsoft.structure.dynamicproxy;

/**  
 * @ClassName: RealStar  
 * @Description: TODO(真实的歌手)  
 * @author ronin  
 * @date 2019年3月23日  
 *    
 */
public class RealStar implements Star {

	/**
	 * <p>Title: confer</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.structure.staticproxy.Star#confer()
	 */

	@Override
	public void confer() {
		System.out.println("RealStar(周杰伦)......confer()");
	}

	/**
	 * <p>Title: signContract</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.structure.staticproxy.Star#signContract()
	 */

	@Override
	public void signContract() {
		System.out.println("RealStar(周杰伦)......signContract()");
	}

	/**
	 * <p>Title: bookTicket</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.structure.staticproxy.Star#bookTicket()
	 */

	@Override
	public void bookTicket() {
		System.out.println("RealStar(周杰伦)......bookTicket()");
	}

	/**
	 * <p>Title: sing</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.structure.staticproxy.Star#sing()
	 */

	@Override
	public void sing() {
		System.out.println("RealStar(周杰伦)......sing()");
	}

	/**
	 * <p>Title: clollectMoney</p>  
	 * <p>Description: </p>    
	 * @see com.dragonsoft.structure.staticproxy.Star#clollectMoney()
	 */

	@Override
	public void clollectMoney() {
		System.out.println("RealStar(周杰伦)......clollectMoney()");
	}

}
