/*练习-接口*/

package charactor;

public interface healer {
	public void heal();
}

public class SupportHero extends Hero implements healer{
	public void heal(){
		System.out.println("治疗了一下");
	}
}


/*练习-重写*/
package property;
 
public class MagicPotion extends Item{
    public void effect(){
        System.out.println( "蓝瓶使用后，可以回魔法");
    }
}

/*练习-多态*/

//Mortal.java
public interface Mortal {
	public void die();
}
//ADAPHero.java
    public void die() {
    	System.out.println("ADAP died");
    }
//Hero.java
    public void kill(Mortal m) {
    	m.die();
    }
    public static void main(String[] args) {
        ADHero adh = new ADHero();
        ADAPHero adaph = new ADAPHero();
        APHero aph = new APHero();
        garen.kill(adh);
        garen.kill(adaph);
        garen.kill(adh);
    }

/*练习-隐藏*/

/*
Hero h =new ADHero();
h.battleWin(); //battleWin是一个类方法
h是父类类型的引用
但是指向一个子类对象
h.battleWin(); 会调用父类的方法？还是子类的方法？
*/

//调用的是父类的类方法。将引用改成ADhero后，调用的就是子类的类方法。