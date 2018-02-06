// *** WARNING: DO NOT MODIFY *** This is a generated Java source code! 
// 
// Generated by LF-ET 2.1.5 (171120a), http://www.lohrfink.de/lfet
// From decision table
// "/data/ws_lfet/LFETParent/LFETBase/src/main/resources/Check4StateMachine.lfet"
// 06.02.2018 00:53
// 

// Prolog Standard ---->
// profile LFET.Java.Prolog.Standard.Interface.Dt.ini not found
// used LF-ET 2.1.5 (171120a) build in default

package org.ckr.lfet.model.check.rules.lfet;

public final class Check4StateMachineETLogic
{
    public final void execute(ICheck4StateMachine iface)
    {
 
        // Prolog Standard <----

        // Prolog Decision Table ---->
        // $$Package=org.ckr.lfet.model.check.rules.lfet
        // $$InterfaceName=ICheck4StateMachine
        // $$InterfaceRulesClassName=Check4StateMachineETLogic
        // Prolog Decision Table <----
        
        if (iface.isstate_INIT())
        {
            if (iface.ishasNextCondition())
            {
                // Rule R01 ---->
                
                iface.doTrace("Check4StateMachine", "20180206.005332", 24, 1);
                iface.donextCondition();
                iface.dostate_CC();
                
                // Rule R01 <----
            }
            else
            {
                // Rule R02 ---->
                
                iface.doTrace("Check4StateMachine", "20180206.005332", 24, 2);
                iface.dostateMachine_N();
                iface.dostate_EXIT();
                
                // Rule R02 <----
            }
        }
        else if (iface.isstate_CC())
        {
            if (iface.isconditionHasOccurenceTable())
            {
                if (iface.isconditionTitleContainsWord_ZUSTAND())
                {
                    if (iface.ishasNextCondition())
                    {
                        // Rule R03 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 3);
                        iface.docountCondition();
                        
                        // Rule R03 <----
                    }
                    else
                    {
                        // Rule R04 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 4);
                        iface.docountCondition();
                        
                        // Rule R04 <----
                    }
                }
                else if (iface.isconditionTitleContainsWord_STATE())
                {
                    if (iface.ishasNextCondition())
                    {
                        // Rule R05 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 5);
                        iface.docountCondition();
                        
                        // Rule R05 <----
                    }
                    else
                    {
                        // Rule R06 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 6);
                        iface.docountCondition();
                        
                        // Rule R06 <----
                    }
                }
                else
                {
                    if (iface.ishasNextCondition())
                    {
                        // Rule R07 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 7);
                        iface.donextCondition();
                        
                        // Rule R07 <----
                    }
                    else
                    {
                        // Rule R08 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 8);
                        iface.dostateMachine_N();
                        iface.dostate_EXIT();
                        
                        // Rule R08 <----
                    }
                }
            }
            else
            {
                if (iface.ishasNextCondition())
                {
                    // Rule R09 ---->
                    
                    iface.doTrace("Check4StateMachine", "20180206.005332", 24, 9);
                    iface.donextCondition();
                    iface.dostate_CC();
                    
                    // Rule R09 <----
                }
                else
                {
                    // Rule R10 ---->
                    
                    iface.doTrace("Check4StateMachine", "20180206.005332", 24, 10);
                    iface.dostateMachine_N();
                    iface.dostate_EXIT();
                    
                    // Rule R10 <----
                }
            }
        }
        else if (iface.isstate_CA())
        {
            if (iface.isactionHasOccurenceTable())
            {
                if (iface.isactionTitleContainsWord_ZUSTAND())
                {
                    if (iface.ishasNextAction())
                    {
                        // Rule R11 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 11);
                        iface.docountAction();
                        iface.donextAction();
                        iface.dostate_CA();
                        
                        // Rule R11 <----
                    }
                    else
                    {
                        // Rule R12 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 12);
                        iface.docountAction();
                        iface.dostate_CHECK();
                        
                        // Rule R12 <----
                    }
                }
                else if (iface.isactionTitleContainsWord_STATE())
                {
                    if (iface.ishasNextAction())
                    {
                        // Rule R13 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 13);
                        iface.docountAction();
                        iface.donextAction();
                        iface.dostate_CA();
                        
                        // Rule R13 <----
                    }
                    else
                    {
                        // Rule R14 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 14);
                        iface.docountAction();
                        iface.dostate_CHECK();
                        
                        // Rule R14 <----
                    }
                }
                else
                {
                    if (iface.ishasNextAction())
                    {
                        // Rule R15 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 15);
                        iface.donextAction();
                        iface.dostate_CA();
                        
                        // Rule R15 <----
                    }
                    else
                    {
                        // Rule R16 ---->
                        
                        iface.doTrace("Check4StateMachine", "20180206.005332", 24, 16);
                        iface.dostate_CHECK();
                        
                        // Rule R16 <----
                    }
                }
            }
            else
            {
                // Rule R17 ---->
                
                iface.doTrace("Check4StateMachine", "20180206.005332", 24, 17);
                iface.dostate_CHECK();
                
                // Rule R17 <----
            }
        }
        else
        {
            if (iface.isnumberOfStateActions_0())
            {
                // Rule R18 ---->
                
                iface.doTrace("Check4StateMachine", "20180206.005332", 24, 18);
                iface.dostateMachine_N();
                iface.dostate_EXIT();
                
                // Rule R18 <----
            }
            else if (iface.isnumberOfStateActions_1())
            {
                if (iface.isnumberOfStateConditions_0())
                {
                    // Rule R19 ---->
                    
                    iface.doTrace("Check4StateMachine", "20180206.005332", 24, 19);
                    iface.dostateMachine_N();
                    iface.dostate_EXIT();
                    
                    // Rule R19 <----
                }
                else if (iface.isnumberOfStateConditions_1())
                {
                    // Rule R20 ---->
                    
                    iface.doTrace("Check4StateMachine", "20180206.005332", 24, 20);
                    iface.dostateMachine_Y();
                    iface.dostate_EXIT();
                    
                    // Rule R20 <----
                }
                else
                {
                    // Rule R21 ---->
                    
                    iface.doTrace("Check4StateMachine", "20180206.005332", 24, 21);
                    iface.dostateMachine_Y();
                    iface.dostate_EXIT();
                    
                    // Rule R21 <----
                }
            }
            else
            {
                if (iface.isnumberOfStateConditions_0())
                {
                    // Rule R22 ---->
                    
                    iface.doTrace("Check4StateMachine", "20180206.005332", 24, 22);
                    iface.dostateMachine_N();
                    iface.dostate_EXIT();
                    
                    // Rule R22 <----
                }
                else if (iface.isnumberOfStateConditions_1())
                {
                    // Rule R23 ---->
                    
                    iface.doTrace("Check4StateMachine", "20180206.005332", 24, 23);
                    iface.dostateMachine_Y();
                    iface.dostate_EXIT();
                    
                    // Rule R23 <----
                }
                else
                {
                    // Rule R24 ---->
                    
                    iface.doTrace("Check4StateMachine", "20180206.005332", 24, 24);
                    iface.dostateMachine_Y();
                    iface.dostate_EXIT();
                    
                    // Rule R24 <----
                }
            }
        }
        
        // Epilog Standard ---->
        // profile LFET.Java.Epilog.Standard.Interface.Dt.ini not found
        // used LF-ET 2.1.5 (171120a) build in default

    }

}
 
// Epilog Standard <----

// End of generated Java source code
// Generated by LF-ET 2.1.5 (171120a), http://www.lohrfink.de/lfet

