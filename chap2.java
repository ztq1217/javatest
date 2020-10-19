// 2-1
public class Item { 
    String name;
    int price;

    public static void main(String[] args) {
	Item xueping = new Item();
	xueping.name = "血瓶";
	xueping.price = 50;

	Item caoxie = new Item();
	caoxie .name = "草鞋";
	caoxie .price = 300;

	Item changjian = new Item();
	changjian.name = "长剑";
	changjian.price = 350;
    }  
}


// 2-2

public class Hero {
    String name; //姓名
      
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度

    int money; //金钱

    int kill; //击杀数

    int death; //死亡次数
   
    int assist; //助攻次数

    String killWords; //击杀后语音

    String beKilledWords; //被杀后语音
}



// 2-3
public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    void legendary(){
       System.out.println("超神了。");
    }

    float getHp(){
       return hp;
    }

    void recovery(float blood){
       hp = hp + blood;
    }
}