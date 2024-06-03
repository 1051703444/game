package com.luckincoffee.role;

import com.luckincoffee.strategy.AttackStrategy;
import com.luckincoffee.template.Warrior;



/**
 * @author 陈志雄
 * @version V1.0
 * @Description 战士-盖伦
 * @Package com.luckincoffee.role
 * @date 2024/6/3
 */
public class Galen extends Warrior {

    public Galen() {
    }

    public Galen(AttackStrategy attackStrategy) {
        super(attackStrategy);
        this.setNickName("Galen");
        this.setHp(800);
        this.setLevel(1);
        this.setMp(null);
        this.setAttackMode("使用近战攻击");
    }
}
