package com.luckincoffee.strategy.impl;

import com.luckincoffee.strategy.AttackStrategy;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description 攻击策略-范围攻击
 * @Package com.luckincoffee.strategy.impl
 * @date 2024/6/3
 */
public class RangeAttack implements AttackStrategy {

    @Override
    public void executeAttack() {
        System.out.println("对多个敌人进行范围攻击");
    }
}
