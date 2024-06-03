package com.luckincoffee.role;

import com.luckincoffee.strategy.AttackStrategy;
import com.luckincoffee.template.Archer;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.luckincoffee.role
 * @date 2024/6/3
 */
public class Ash extends Archer {
    public Ash() {
    }

    public Ash(AttackStrategy attackStrategy) {
        super(attackStrategy);
        this.setNickName("Ash");
        this.setAttackMode("远程攻击");
    }
}
