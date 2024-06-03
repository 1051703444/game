package com.luckincoffee.role;

import com.luckincoffee.strategy.AttackStrategy;
import com.luckincoffee.template.Assassin;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.luckincoffee.role
 * @date 2024/6/3
 */
public class Katerina extends Assassin {
    public Katerina() {
    }

    public Katerina(AttackStrategy attackStrategy) {
        super(attackStrategy);
        this.setNickName("Katerina");
        this.setAttackMode("近战攻击");
    }
}
