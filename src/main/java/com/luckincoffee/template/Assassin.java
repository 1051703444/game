package com.luckincoffee.template;

import com.luckincoffee.strategy.AttackStrategy;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description 刺客模板类
 * @Package com.luckincoffee.template
 * @date 2024/6/3
 */
public class Assassin extends Character{
    public Assassin() {
    }

    public Assassin(AttackStrategy attackStrategy) {
        super(attackStrategy);
    }

    @Override
    protected void chooseAttackMode() {
        System.out.println(this.getAttackMode());
    }

    @Override
    protected void executeAttack() {
        attackStrategy.executeAttack();
    }
}
