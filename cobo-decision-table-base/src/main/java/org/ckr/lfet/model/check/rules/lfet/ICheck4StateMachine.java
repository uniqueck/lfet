// *** WARNING: DO NOT MODIFY *** This is a generated Java source code! 
// 
// Generated by LF-ET 2.1.5 (171120a), http://www.lohrfink.de/lfet
// From decision table
// "/data/ws_lfet/LFETParent/LFETBase/src/main/resources/Check4StateMachine.lfet"
// 06.02.2018 00:53
// 
// Prolog Standard ---->
// profile LFET.Java.Prolog.Standard.Interface.ini not found
// used LF-ET 2.1.5 (171120a) build in default

package org.ckr.lfet.model.check.rules.lfet;

public interface ICheck4StateMachine
{
 
    // Prolog Standard <----

    // Prolog Decision Table ---->
    // $$Package=org.ckr.lfet.model.check.rules.lfet
    // $$InterfaceName=ICheck4StateMachine
    // $$InterfaceRulesClassName=Check4StateMachineETLogic
    // Prolog Decision Table <----
    
    /** 
     * <b>C01: state</b><br>
     * <br>
     * <b>C01/01: INIT - initialize</b>
     */
    public boolean isstate_INIT();
    
    /** 
     * <b>C01: state</b><br>
     * <br>
     * <b>C01/02: CC - count state conditions</b>
     */
    public boolean isstate_CC();
    
    /** 
     * <b>C01: state</b><br>
     * <br>
     * <b>C01/03: CA - count state actions</b>
     */
    public boolean isstate_CA();
    
    /** 
     * <b>C02: condition has occurence table</b>
     */
    public boolean isconditionHasOccurenceTable();
    
    /** 
     * <b>C03: condition title contains word ...</b><br>
     * <br>
     * <b>C03/01: ZUSTAND - german word for state</b>
     */
    public boolean isconditionTitleContainsWord_ZUSTAND();
    
    /** 
     * <b>C03: condition title contains word ...</b><br>
     * <br>
     * <b>C03/02: STATE - state</b>
     */
    public boolean isconditionTitleContainsWord_STATE();
    
    /** 
     * <b>C04: has next condition</b>
     */
    public boolean ishasNextCondition();
    
    /** 
     * <b>C05: action has occurence table</b>
     */
    public boolean isactionHasOccurenceTable();
    
    /** 
     * <b>C06: action title contains word ...</b><br>
     * <br>
     * <b>C06/01: ZUSTAND - german word for state</b>
     */
    public boolean isactionTitleContainsWord_ZUSTAND();
    
    /** 
     * <b>C06: action title contains word ...</b><br>
     * <br>
     * <b>C06/02: STATE - state</b>
     */
    public boolean isactionTitleContainsWord_STATE();
    
    /** 
     * <b>C07: has next action</b>
     */
    public boolean ishasNextAction();
    
    /** 
     * <b>C08: number of state actions</b><br>
     * <br>
     * <b>C08/01: 0 - no state actions</b>
     */
    public boolean isnumberOfStateActions_0();
    
    /** 
     * <b>C08: number of state actions</b><br>
     * <br>
     * <b>C08/02: 1 - one state action</b>
     */
    public boolean isnumberOfStateActions_1();
    
    /** 
     * <b>C09: number of state conditions</b><br>
     * <br>
     * <b>C09/01: 0 - no state condion</b>
     */
    public boolean isnumberOfStateConditions_0();
    
    /** 
     * <b>C09: number of state conditions</b><br>
     * <br>
     * <b>C09/02: 1 - one state conditions</b>
     */
    public boolean isnumberOfStateConditions_1();
    
    /** 
     * <b>A01: count condition</b>
     */
    public void docountCondition();
    
    /** 
     * <b>A02: count action</b>
     */
    public void docountAction();
    
    /** 
     * <b>A03: state machine</b><br>
     * <br>
     * <b>A03/01: Y - is state machine</b>
     */
    public void dostateMachine_Y();
    
    /** 
     * <b>A03: state machine</b><br>
     * <br>
     * <b>A03/02: N - no state machine</b>
     */
    public void dostateMachine_N();
    
    /** 
     * <b>A04: next condition</b>
     */
    public void donextCondition();
    
    /** 
     * <b>A05: next action</b>
     */
    public void donextAction();
    
    /** 
     * <b>A06: state</b><br>
     * <br>
     * <b>A06/01: EXIT - exit</b>
     */
    public void dostate_EXIT();
    
    /** 
     * <b>A06: state</b><br>
     * <br>
     * <b>A06/02: CC - count state conditions</b>
     */
    public void dostate_CC();
    
    /** 
     * <b>A06: state</b><br>
     * <br>
     * <b>A06/03: CHECK - check for state machine</b>
     */
    public void dostate_CHECK();
    
    /** 
     * <b>A06: state</b><br>
     * <br>
     * <b>A06/04: CA - count state actions</b>
     */
    public void dostate_CA();
    
    public void doTrace(java.lang.String dtName, java.lang.String version, int rules, int rule);

    // Epilog Standard ---->
    // profile LFET.Java.Epilog.Standard.Interface.ini not found
    // used LF-ET 2.1.5 (171120a) build in default

}
 
// Epilog Standard <----

// End of generated Java source code
// Generated by LF-ET 2.1.5 (171120a), http://www.lohrfink.de/lfet

