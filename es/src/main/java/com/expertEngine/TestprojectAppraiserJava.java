package com.expertEngine;

import java.util.HashMap;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.Gpr;
import net.sourceforge.jFuzzyLogic.defuzzifier.DefuzzifierCenterOfArea;
import net.sourceforge.jFuzzyLogic.defuzzifier.DefuzzifierCenterOfGravity;
import net.sourceforge.jFuzzyLogic.membership.MembershipFunction;
import net.sourceforge.jFuzzyLogic.membership.MembershipFunctionPieceWiseLinear;
import net.sourceforge.jFuzzyLogic.membership.MembershipFunctionTrapetzoidal;
import net.sourceforge.jFuzzyLogic.membership.MembershipFunctionTriangular;
import net.sourceforge.jFuzzyLogic.membership.Value;
import net.sourceforge.jFuzzyLogic.plot.JDialogFis;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.LinguisticTerm;
import net.sourceforge.jFuzzyLogic.rule.Rule;
import net.sourceforge.jFuzzyLogic.rule.RuleBlock;
import net.sourceforge.jFuzzyLogic.rule.RuleExpression;
import net.sourceforge.jFuzzyLogic.rule.RuleTerm;
import net.sourceforge.jFuzzyLogic.rule.Variable;
import net.sourceforge.jFuzzyLogic.ruleAccumulationMethod.RuleAccumulationMethodMax;
import net.sourceforge.jFuzzyLogic.ruleActivationMethod.RuleActivationMethodMin;
import net.sourceforge.jFuzzyLogic.ruleConnectionMethod.RuleConnectionMethodAndMin;
import net.sourceforge.jFuzzyLogic.ruleConnectionMethod.RuleConnectionMethodAndProduct;
import net.sourceforge.jFuzzyLogic.ruleConnectionMethod.RuleConnectionMethodOrMax;

public class TestprojectAppraiserJava {

    public static int count = 5;

    public static void main(String[] args) throws Exception {
//        System.out.println("Begin Test projectAppraiser Java");
//
//        FIS fis = new FIS();
//
//        FunctionBlock functionBlock = new FunctionBlock(fis);
//        fis.addFunctionBlock("projectAppraiser", functionBlock);
//
//        Variable budget = new Variable("budget");
//        Variable devNumber = new Variable("devNumber");
//        Variable devTime = new Variable("devTime");
//        functionBlock.setVariable(budget.getName(), budget);
//        functionBlock.setVariable(devNumber.getName(), devNumber);
//        functionBlock.setVariable(devTime.getName(), devTime);
//
//        Variable solution = new Variable("solution");
//        functionBlock.setVariable(solution.getName(), solution);
//
//        Value[] poorX = { new Value(0), new Value(50) };
//        Value[] poorY = { new Value(1), new Value(0) };
//        MembershipFunction smallBudget = new MembershipFunctionPieceWiseLinear(poorX, poorY);
//
//        MembershipFunction mediumBudget = new MembershipFunctionTrapetzoidal(new Value(40), new Value(100), new Value(150), new Value(200));
//
//        Value[] exX = { new Value(170), new Value(250), new Value(300) };
//        Value[] exY = { new Value(0), new Value(1), new Value(1) };
//        MembershipFunction bigBudget = new MembershipFunctionPieceWiseLinear(exX, exY);
//
//        LinguisticTerm ltSmallBudget = new LinguisticTerm("small", smallBudget);
//        LinguisticTerm ltMediumBudget = new LinguisticTerm("medium", mediumBudget);
//        LinguisticTerm ltBigBudget = new LinguisticTerm("big", bigBudget);
//
//        budget.add(ltSmallBudget);
//        budget.add(ltMediumBudget);
//        budget.add(ltBigBudget);
//
//        Value[] ranX = { new Value(0), new Value(1), new Value(4) };
//        Value[] ranY = { new Value(1), new Value(1), new Value(0) };
//        MembershipFunction fewDevs = new MembershipFunctionPieceWiseLinear(ranX, ranY);
//
//        MembershipFunction averageDevs = new MembershipFunctionTrapetzoidal(new Value(3), new Value(4), new Value(6), new Value(9));
//
//        Value[] delX = { new Value(7), new Value(9), new Value(10) };
//        Value[] delY = { new Value(0), new Value(1), new Value(1) };
//        MembershipFunction manyDevs = new MembershipFunctionPieceWiseLinear(delX, delY);
//
//        LinguisticTerm ltRancid = new LinguisticTerm("few", fewDevs);
//        LinguisticTerm ltDelicious = new LinguisticTerm("average", averageDevs);
//        LinguisticTerm ltManyDevs = new LinguisticTerm("many", manyDevs);
//
//        devNumber.add(ltRancid);
//        devNumber.add(ltDelicious);
//        devNumber.add(ltManyDevs);
//
//        Value[] shoX = { new Value(0), new Value(4), new Value(8) };
//        Value[] shoY = { new Value(1), new Value(1), new Value(0) };
//        MembershipFunction shortTime = new MembershipFunctionPieceWiseLinear(shoX, shoY);
//
//        MembershipFunction averageTime = new MembershipFunctionTrapetzoidal(new Value(6), new Value(15), new Value(20), new Value(35));
//
//        Value[] lonX = { new Value(30), new Value(35), new Value(60) };
//        Value[] lonY = { new Value(0), new Value(1), new Value(1) };
//        MembershipFunction longTime = new MembershipFunctionPieceWiseLinear(lonX, lonY);
//
//        LinguisticTerm ltShortTime = new LinguisticTerm("short", shortTime);
//        LinguisticTerm ltAverageTime = new LinguisticTerm("average", averageTime);
//        LinguisticTerm ltLongTime = new LinguisticTerm("long", longTime);
//
//        devTime.add(ltShortTime);
//        devTime.add(ltAverageTime);
//        devTime.add(ltLongTime);
//
//        MembershipFunction cheap = new MembershipFunctionTriangular(new Value(0), new Value(5), new Value(10));
//        MembershipFunction average = new MembershipFunctionTriangular(new Value(10), new Value(15), new Value(20));
//        MembershipFunction generous = new MembershipFunctionTriangular(new Value(20), new Value(25), new Value(30));
//
//        LinguisticTerm ltCheap = new LinguisticTerm("bad", cheap);
//        LinguisticTerm ltAverage = new LinguisticTerm("normal", average);
//        LinguisticTerm ltGenerous = new LinguisticTerm("good", generous);
//
//        solution.add(ltCheap);
//        solution.add(ltAverage);
//        solution.add(ltGenerous);
//
//        solution.setDefuzzifier(new DefuzzifierCenterOfGravity(solution));
//
//        RuleBlock ruleBlock = new RuleBlock(functionBlock);
//        ruleBlock.setName("No1");
//        ruleBlock.setRuleAccumulationMethod(new RuleAccumulationMethodMax());
//        ruleBlock.setRuleActivationMethod(new RuleActivationMethodMin());
//
//        Rule rule1 = new Rule("Rule1", ruleBlock);
//        rule1.addAntecedent(budget, "big", false);
//        rule1.addAntecedent(devNumber, "few", false);
//        rule1.addConsequent(solution, "bad", false);
//        ruleBlock.add(rule1);
//
//        Rule rule2 = new Rule("Rule2", ruleBlock);
//        rule2.addAntecedent(budget, "small", false);
//        rule2.addConsequent(solution, "normal", false);
//        ruleBlock.add(rule2);
//
//        Rule rule3 = new Rule("Rule3", ruleBlock);
//        RuleTerm term1 = new RuleTerm(budget, "big", false); // Create 'terms'
//        RuleTerm term2 = new RuleTerm(budget, "small", false);
//        RuleTerm term3 = new RuleTerm(devNumber, "many", false);
//
//        RuleExpression antecedentOr = new RuleExpression(term1, term2, RuleConnectionMethodOrMax.get()); // Combine terms using connection methods: OR, AND
//        RuleExpression antecedentAnd = new RuleExpression(antecedentOr, term3, RuleConnectionMethodAndMin.get());
//        rule3.setAntecedents(antecedentAnd); // Set antecedent
//
//        rule3.addConsequent(solution, "good", false);
//        ruleBlock.add(rule3);
//
//        HashMap<String, RuleBlock> ruleBlocksMap = new HashMap<String, RuleBlock>();
//        ruleBlocksMap.put(ruleBlock.getName(), ruleBlock);
//        functionBlock.setRuleBlocks(ruleBlocksMap);
//
//        System.out.println(fis);
////        animateFis(fis);
//
//        System.out.println("End TestprojectAppraiserJava");
//        functionBlock.setVariable("budget", 180);
//        functionBlock.setVariable("devNumber", 3);
//        functionBlock.setVariable("devTime", 10);
//
//        functionBlock.evaluate();
//
//        System.out.println(functionBlock.getVariable("solution").getValue());
//
//        JFuzzyChart.get().chart(functionBlock);
    }

    public static double solutionMamdani(int iBudget, int iDevNum, int iDevTime){
        System.out.println("Begin Test projectAppraiser Java");

        FIS fis = new FIS();

        FunctionBlock functionBlock = new FunctionBlock(fis);
        fis.addFunctionBlock("projectAppraiser", functionBlock);

        Variable budget = new Variable("budget");
        Variable devNumber = new Variable("devNumber");
        Variable devTime = new Variable("devTime");
        functionBlock.setVariable(budget.getName(), budget);
        functionBlock.setVariable(devNumber.getName(), devNumber);
        functionBlock.setVariable(devTime.getName(), devTime);

        Variable solution = new Variable("solution");
        functionBlock.setVariable(solution.getName(), solution);

        Value[] poorX = { new Value(0), new Value(50) };
        Value[] poorY = { new Value(1), new Value(0) };
        MembershipFunction smallBudget = new MembershipFunctionPieceWiseLinear(poorX, poorY);

        MembershipFunction mediumBudget = new MembershipFunctionTrapetzoidal(new Value(40), new Value(100), new Value(150), new Value(200));

        Value[] exX = { new Value(170), new Value(250), new Value(300) };
        Value[] exY = { new Value(0), new Value(1), new Value(1) };
        MembershipFunction bigBudget = new MembershipFunctionPieceWiseLinear(exX, exY);

        LinguisticTerm ltSmallBudget = new LinguisticTerm("small", smallBudget);
        LinguisticTerm ltMediumBudget = new LinguisticTerm("medium", mediumBudget);
        LinguisticTerm ltBigBudget = new LinguisticTerm("big", bigBudget);

        budget.add(ltSmallBudget);
        budget.add(ltMediumBudget);
        budget.add(ltBigBudget);

        Value[] ranX = { new Value(0), new Value(1), new Value(4) };
        Value[] ranY = { new Value(1), new Value(1), new Value(0) };
        MembershipFunction fewDevs = new MembershipFunctionPieceWiseLinear(ranX, ranY);

        MembershipFunction averageDevs = new MembershipFunctionTrapetzoidal(new Value(3), new Value(4), new Value(6), new Value(9));

        Value[] delX = { new Value(7), new Value(9), new Value(10) };
        Value[] delY = { new Value(0), new Value(1), new Value(1) };
        MembershipFunction manyDevs = new MembershipFunctionPieceWiseLinear(delX, delY);

        LinguisticTerm ltRancid = new LinguisticTerm("few", fewDevs);
        LinguisticTerm ltDelicious = new LinguisticTerm("average", averageDevs);
        LinguisticTerm ltManyDevs = new LinguisticTerm("many", manyDevs);

        devNumber.add(ltRancid);
        devNumber.add(ltDelicious);
        devNumber.add(ltManyDevs);

        Value[] shoX = { new Value(0), new Value(8) };
        Value[] shoY = { new Value(1), new Value(0) };
        MembershipFunction shortTime = new MembershipFunctionTrapetzoidal(new Value(0), new Value(4), new Value(6), new Value(8));

        MembershipFunction averageTime = new MembershipFunctionTrapetzoidal(new Value(6), new Value(15), new Value(20), new Value(35));

        Value[] lonX = { new Value(30), new Value(35), new Value(60) };
        Value[] lonY = { new Value(0), new Value(1), new Value(1) };
        MembershipFunction longTime = new MembershipFunctionPieceWiseLinear(lonX, lonY);

        LinguisticTerm ltShortTime = new LinguisticTerm("short", shortTime);
        LinguisticTerm ltAverageTime = new LinguisticTerm("average", averageTime);
        LinguisticTerm ltLongTime = new LinguisticTerm("long", longTime);

        devTime.add(ltShortTime);
        devTime.add(ltAverageTime);
        devTime.add(ltLongTime);

        MembershipFunction cheap = new MembershipFunctionTriangular(new Value(0), new Value(15), new Value(30));
        MembershipFunction average = new MembershipFunctionTriangular(new Value(20), new Value(60), new Value(80));
        MembershipFunction generous = new MembershipFunctionTriangular(new Value(75), new Value(90), new Value(100));

        LinguisticTerm ltCheap = new LinguisticTerm("bad", cheap);
        LinguisticTerm ltAverage = new LinguisticTerm("normal", average);
        LinguisticTerm ltGenerous = new LinguisticTerm("good", generous);

        solution.add(ltCheap);
        solution.add(ltAverage);
        solution.add(ltGenerous);

        solution.setDefuzzifier(new DefuzzifierCenterOfGravity(solution));

        RuleBlock ruleBlock = new RuleBlock(functionBlock);
        ruleBlock.setName("No1");
        ruleBlock.setRuleAccumulationMethod(new RuleAccumulationMethodMax());
        ruleBlock.setRuleActivationMethod(new RuleActivationMethodMin());

        Rule rule1 = new Rule("Rule1", ruleBlock);
        rule1.addAntecedent(budget, "small", false);
        rule1.addAntecedent(devNumber, "many", false);
        rule1.addConsequent(solution, "bad", false);
        ruleBlock.add(rule1);

        Rule rule2 = new Rule("Rule2", ruleBlock);
        rule2.addAntecedent(budget, "big", false);
        rule2.addAntecedent(devNumber, "average", false);
        rule2.addConsequent(solution, "normal", false);
        ruleBlock.add(rule2);

        Rule rule3 = new Rule("Rule3", ruleBlock);
        rule3.addAntecedent(budget, "medium", false);
        rule3.addAntecedent(devNumber, "few", false);
        rule3.addConsequent(solution, "normal", false);
        ruleBlock.add(rule3);

        Rule rule4 = new Rule("Rule4", ruleBlock);
        RuleTerm term1 = new RuleTerm(budget, "small", false); // Create 'terms'
        RuleTerm term2 = new RuleTerm(devTime, "short", false);
        RuleTerm term3 = new RuleTerm(devNumber, "few", false);

        RuleExpression antecedentOr = new RuleExpression(term1, term2, RuleConnectionMethodAndMin.get()); // Combine terms using connection methods: OR, AND
        RuleExpression antecedentAnd = new RuleExpression(antecedentOr, term3, RuleConnectionMethodAndMin.get());
        rule4.setAntecedents(antecedentAnd); // Set antecedent

        rule4.addConsequent(solution, "good", false);
        ruleBlock.add(rule4);


        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "small", "few", "average", "normal"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "small", "few", "long", "bad"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "small", "average", "average", "bad"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "small", "average", "short", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "small", "average", "long", "bad"));

        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "medium", "average", "short", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "medium", "average", "average", "bad"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "medium", "average", "long", "bad"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "medium", "many", "short", "normal"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "medium", "many", "average", "normal"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "medium", "many", "long", "bad"));

        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "big", "few", "short", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "big", "few", "average", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "big", "few", "long", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "big", "many", "short", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "big", "many", "average", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleMamdani(ruleBlock, budget, devTime, devNumber, solution, "big", "many", "long", "normal"));


        HashMap<String, RuleBlock> ruleBlocksMap = new HashMap<String, RuleBlock>();
        ruleBlocksMap.put(ruleBlock.getName(), ruleBlock);
        functionBlock.setRuleBlocks(ruleBlocksMap);

        System.out.println(fis);

        System.out.println("End TestProjectAppraiserJava");
        functionBlock.setVariable("budget", iBudget);
        functionBlock.setVariable("devNumber", iDevNum);
        functionBlock.setVariable("devTime", iDevTime);

        functionBlock.evaluate();

        TestprojectAppraiserJava.count = 5;
        return functionBlock.getVariable("solution").getValue();
    }
    public static double solutionLarsen(int iBudget, int iDevNum, int iDevTime){
        System.out.println("Begin Test projectAppraiser Java");

        FIS fis = new FIS();

        FunctionBlock functionBlock = new FunctionBlock(fis);
        fis.addFunctionBlock("projectAppraiser", functionBlock);

        Variable budget = new Variable("budget");
        Variable devNumber = new Variable("devNumber");
        Variable devTime = new Variable("devTime");
        functionBlock.setVariable(budget.getName(), budget);
        functionBlock.setVariable(devNumber.getName(), devNumber);
        functionBlock.setVariable(devTime.getName(), devTime);

        Variable solution = new Variable("solution");
        functionBlock.setVariable(solution.getName(), solution);

        Value[] poorX = { new Value(0), new Value(50) };
        Value[] poorY = { new Value(1), new Value(0) };
        MembershipFunction smallBudget = new MembershipFunctionPieceWiseLinear(poorX, poorY);

        MembershipFunction mediumBudget = new MembershipFunctionTrapetzoidal(new Value(40), new Value(100), new Value(150), new Value(200));

        Value[] exX = { new Value(170), new Value(250), new Value(300) };
        Value[] exY = { new Value(0), new Value(1), new Value(1) };
        MembershipFunction bigBudget = new MembershipFunctionPieceWiseLinear(exX, exY);

        LinguisticTerm ltSmallBudget = new LinguisticTerm("small", smallBudget);
        LinguisticTerm ltMediumBudget = new LinguisticTerm("medium", mediumBudget);
        LinguisticTerm ltBigBudget = new LinguisticTerm("big", bigBudget);

        budget.add(ltSmallBudget);
        budget.add(ltMediumBudget);
        budget.add(ltBigBudget);

        Value[] ranX = { new Value(0), new Value(1), new Value(4) };
        Value[] ranY = { new Value(1), new Value(1), new Value(0) };
        MembershipFunction fewDevs = new MembershipFunctionPieceWiseLinear(ranX, ranY);

        MembershipFunction averageDevs = new MembershipFunctionTrapetzoidal(new Value(3), new Value(4), new Value(6), new Value(9));

        Value[] delX = { new Value(7), new Value(9), new Value(10) };
        Value[] delY = { new Value(0), new Value(1), new Value(1) };
        MembershipFunction manyDevs = new MembershipFunctionPieceWiseLinear(delX, delY);

        LinguisticTerm ltRancid = new LinguisticTerm("few", fewDevs);
        LinguisticTerm ltDelicious = new LinguisticTerm("average", averageDevs);
        LinguisticTerm ltManyDevs = new LinguisticTerm("many", manyDevs);

        devNumber.add(ltRancid);
        devNumber.add(ltDelicious);
        devNumber.add(ltManyDevs);

        Value[] shoX = { new Value(0), new Value(8) };
        Value[] shoY = { new Value(1), new Value(0) };
        MembershipFunction shortTime = new MembershipFunctionTrapetzoidal(new Value(0), new Value(4), new Value(6), new Value(8));

        MembershipFunction averageTime = new MembershipFunctionTrapetzoidal(new Value(6), new Value(15), new Value(20), new Value(35));

        Value[] lonX = { new Value(30), new Value(35), new Value(60) };
        Value[] lonY = { new Value(0), new Value(1), new Value(1) };
        MembershipFunction longTime = new MembershipFunctionPieceWiseLinear(lonX, lonY);

        LinguisticTerm ltShortTime = new LinguisticTerm("short", shortTime);
        LinguisticTerm ltAverageTime = new LinguisticTerm("average", averageTime);
        LinguisticTerm ltLongTime = new LinguisticTerm("long", longTime);

        devTime.add(ltShortTime);
        devTime.add(ltAverageTime);
        devTime.add(ltLongTime);

        MembershipFunction cheap = new MembershipFunctionTriangular(new Value(0), new Value(15), new Value(30));
        MembershipFunction average = new MembershipFunctionTriangular(new Value(20), new Value(60), new Value(80));
        MembershipFunction generous = new MembershipFunctionTriangular(new Value(75), new Value(90), new Value(100));

        LinguisticTerm ltCheap = new LinguisticTerm("bad", cheap);
        LinguisticTerm ltAverage = new LinguisticTerm("normal", average);
        LinguisticTerm ltGenerous = new LinguisticTerm("good", generous);

        solution.add(ltCheap);
        solution.add(ltAverage);
        solution.add(ltGenerous);

        solution.setDefuzzifier(new DefuzzifierCenterOfArea(solution));

        RuleBlock ruleBlock = new RuleBlock(functionBlock);
        ruleBlock.setName("No1");
        ruleBlock.setRuleAccumulationMethod(new RuleAccumulationMethodMax());
        ruleBlock.setRuleActivationMethod(new RuleActivationMethodMin());

        Rule rule1 = new Rule("Rule1", ruleBlock);
        rule1.addAntecedent(budget, "small", false);
        rule1.addAntecedent(devNumber, "many", false);
        rule1.addConsequent(solution, "bad", false);
        ruleBlock.add(rule1);

        Rule rule2 = new Rule("Rule2", ruleBlock);
        rule2.addAntecedent(budget, "big", false);
        rule2.addAntecedent(devNumber, "average", false);
        rule2.addConsequent(solution, "normal", false);
        ruleBlock.add(rule2);

        Rule rule3 = new Rule("Rule3", ruleBlock);
        rule3.addAntecedent(budget, "medium", false);
        rule3.addAntecedent(devNumber, "few", false);
        rule3.addConsequent(solution, "normal", false);
        ruleBlock.add(rule3);

        Rule rule4 = new Rule("Rule4", ruleBlock);
        RuleTerm term1 = new RuleTerm(budget, "small", false); // Create 'terms'
        RuleTerm term2 = new RuleTerm(devTime, "short", false);
        RuleTerm term3 = new RuleTerm(devNumber, "few", false);

        RuleExpression antecedentOr = new RuleExpression(term1, term2, RuleConnectionMethodAndMin.get()); // Combine terms using connection methods: OR, AND
        RuleExpression antecedentAnd = new RuleExpression(antecedentOr, term3, RuleConnectionMethodAndMin.get());
        rule4.setAntecedents(antecedentAnd); // Set antecedent

        rule4.addConsequent(solution, "good", false);
        ruleBlock.add(rule4);


        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "small", "few", "average", "normal"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "small", "few", "long", "bad"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "small", "average", "average", "bad"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "small", "average", "short", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "small", "average", "long", "bad"));

        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "medium", "average", "short", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "medium", "average", "average", "bad"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "medium", "average", "long", "bad"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "medium", "many", "short", "normal"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "medium", "many", "average", "normal"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "medium", "many", "long", "bad"));

        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "big", "few", "short", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "big", "few", "average", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "big", "few", "long", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "big", "many", "short", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "big", "many", "average", "good"));
        ruleBlock.add(TestprojectAppraiserJava.createRuleLarsen(ruleBlock, budget, devTime, devNumber, solution, "big", "many", "long", "normal"));


        HashMap<String, RuleBlock> ruleBlocksMap = new HashMap<String, RuleBlock>();
        ruleBlocksMap.put(ruleBlock.getName(), ruleBlock);
        functionBlock.setRuleBlocks(ruleBlocksMap);

        System.out.println(fis);

        System.out.println("End TestProjectAppraiserJava");
        functionBlock.setVariable("budget", iBudget);
        functionBlock.setVariable("devNumber", iDevNum);
        functionBlock.setVariable("devTime", iDevTime);

        functionBlock.evaluate();

        TestprojectAppraiserJava.count = 5;
        return functionBlock.getVariable("solution").getValue();
    }

    public static Rule createRuleMamdani(
            RuleBlock ruleBlock,
            Variable budget,
            Variable devTime,
            Variable devNumber,
            Variable solution,
            String b,
            String dn,
            String dt,
            String s
    ){
        String ruleName = "Rule" + Integer.toString(TestprojectAppraiserJava.count);
        count++;
        Rule rule = new Rule(ruleName, ruleBlock);
        RuleTerm term1 = new RuleTerm(budget, b, false); // Create 'terms'
        RuleTerm term2 = new RuleTerm(devTime, dt, false);
        RuleTerm term3 = new RuleTerm(devNumber, dn, false);

        RuleExpression antecedentOr = new RuleExpression(term1, term2, RuleConnectionMethodAndMin.get()); // Combine terms using connection methods: OR, AND
        RuleExpression antecedentAnd = new RuleExpression(antecedentOr, term3, RuleConnectionMethodAndMin.get());
        rule.setAntecedents(antecedentAnd); // Set antecedent

        rule.addConsequent(solution, s, false);
        return rule;
    }
    public static Rule createRuleLarsen(
            RuleBlock ruleBlock,
            Variable budget,
            Variable devTime,
            Variable devNumber,
            Variable solution,
            String b,
            String dn,
            String dt,
            String s
    ){
        String ruleName = "Rule" + Integer.toString(TestprojectAppraiserJava.count);
        count++;
        Rule rule = new Rule(ruleName, ruleBlock);
        RuleTerm term1 = new RuleTerm(budget, b, false); // Create 'terms'
        RuleTerm term2 = new RuleTerm(devTime, dt, false);
        RuleTerm term3 = new RuleTerm(devNumber, dn, false);

        RuleExpression antecedentOr = new RuleExpression(term1, term2, RuleConnectionMethodAndProduct.get()); // Combine terms using connection methods: OR, AND
        RuleExpression antecedentAnd = new RuleExpression(antecedentOr, term3, RuleConnectionMethodAndMin.get());
        rule.setAntecedents(antecedentAnd); // Set antecedent

        rule.addConsequent(solution, s, false);
        return rule;
    }
}
