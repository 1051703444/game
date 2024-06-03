package com.luckincoffee.template;

import com.luckincoffee.skill.Skill;
import com.luckincoffee.strategy.AttackStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package com.luckincoffee.template
 * @date 2024/6/3
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Character {
    //角色昵称
    private String nickName;
    //角色等级
    private Integer level;
    //角色血量
    private Integer hp;
    //角色蓝量
    private Integer mp;
    //角色攻击力
    private Integer ad;
    //角色法术强度
    private Integer ap;
    //角色护甲
    private Integer ac;
    //角色魔抗
    private Integer sr;
    //角色攻击方式
    private String attackMode;
    //角色技能
    private List<Skill> skillList;
    //角色攻击策略
    protected AttackStrategy attackStrategy;

    public Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    /**
     * @description
     * @param
     * @return void
     * @author create by ChenZhixiong on 2024/6/3 2:13
     */

    public void attack() {
        prepareWeapon();
        chooseAttackMode();
        chooseTarget();
        executeAttack();
    }
    /**
     * @description
     * @param
     * @return void
     * @author create by ChenZhixiong on 2024/6/3 2:13
     */

    protected void prepareWeapon() {
        System.out.println("准备武器中...");
    }
    /**
     * @description
     * @param
     * @return void
     * @author create by ChenZhixiong on 2024/6/3 2:13
     */

    protected abstract void chooseAttackMode();
    /**
     * @description
     * @param
     * @return void
     * @author create by ChenZhixiong on 2024/6/3 2:13
     */


    protected void chooseTarget() {
        System.out.println("选择目标中...");
    }
    /**
     * @description
     * @param
     * @return void
     * @author create by ChenZhixiong on 2024/6/3 2:13
     */

    protected abstract void executeAttack();
}


