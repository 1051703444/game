package com.luckincoffee.strategy.impl;

import com.luckincoffee.strategy.AttackStrategy;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description 攻击策略-单体攻击
 * @Package com.luckincoffee.strategy.impl
 * @date 2024/6/3
 */
public class MonomerAttack implements AttackStrategy {
    @Override
    public void executeAttack() {
        System.out.println("对单个敌人造成了伤害");
    }
}
