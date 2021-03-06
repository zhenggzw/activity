package com.opvita.activity.daowrapper;

import com.opvita.activity.model.Rule;
import com.opvita.activity.model.RuleReward;

import java.util.List;

/**
 * Created by rd on 2015/4/25.
 */
public interface ActivityRuleDAO {
    // 根据规则主键列表获取一组规则，并按优先级倒序排序
    public List<Rule> getRules(List<String> ruleIds);

    // 根据规则主键获取规则
    public Rule getRule(String ruleId);
    public Rule getRuleOnly(String ruleId);

    // 保存规则，并且保存规则数据
    public Rule saveRule(Rule rule);

    // 保存规则，并且保存规则数据
    public Rule saveRule(Rule rule, List<RuleReward> dataList);

    // 物理删除活动和规则的关联关系，同时删除规则，(调用removeRule)
    // 推荐使用软删除
    public void detachRule(String activityId, String ruleId);

    // 软删除活动和规则的关联关系，同时删除规则，(调用invalidateRule)
    public void unlinkRule(String activityId, String ruleId);

    // 根据规则id删除规则，同时删除商品参与规则、规则数据
    // 推荐使用软删除
    public void removeRule(String ruleId);

    // 根据规则id软删除规则，操作表同removeRule
    public void invalidateRule(String ruleId);
}
