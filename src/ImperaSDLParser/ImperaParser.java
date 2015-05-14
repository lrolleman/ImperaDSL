// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g 2015-05-14 11:21:21

package ImperaSDLParser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class ImperaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "DECL", "BLOCK", "FUNCTION", "PARAMS", "POS", "NEG", "CALL", "ARGS", "CAST", "ID", "EQUAL", "SC", "BREAK", "CONTINUE", "WHILE", "LP", "RP", "IF", "ELSE", "RETURN", "PRINT", "PRINTLN", "LBRACE", "RBRACE", "SET", "COMMA", "XOR", "OR", "AND", "EQUIV", "NOTEQ", "LTHAN", "GTHAN", "LTHANE", "GTHANE", "PLUS", "MINUS", "CONCAT", "MULT", "DIV", "POW", "NOT", "GET", "KVPAIR", "NUMBER", "FPNUMBER", "TRUE", "FALSE", "STRING", "QUOTE", "VAR", "KEY", "OBJECT", "ARRAY", "VOID", "MULTILINE_COMMENT", "COMMENT", "LB", "RB", "DOT", "NULL", "US", "BSLASH", "AS", "PRED", "WS", "DIGIT"
    };
    public static final int EOF=-1;
    public static final int PROGRAM=4;
    public static final int DECL=5;
    public static final int BLOCK=6;
    public static final int FUNCTION=7;
    public static final int PARAMS=8;
    public static final int POS=9;
    public static final int NEG=10;
    public static final int CALL=11;
    public static final int ARGS=12;
    public static final int CAST=13;
    public static final int ID=14;
    public static final int EQUAL=15;
    public static final int SC=16;
    public static final int BREAK=17;
    public static final int CONTINUE=18;
    public static final int WHILE=19;
    public static final int LP=20;
    public static final int RP=21;
    public static final int IF=22;
    public static final int ELSE=23;
    public static final int RETURN=24;
    public static final int PRINT=25;
    public static final int PRINTLN=26;
    public static final int LBRACE=27;
    public static final int RBRACE=28;
    public static final int SET=29;
    public static final int COMMA=30;
    public static final int XOR=31;
    public static final int OR=32;
    public static final int AND=33;
    public static final int EQUIV=34;
    public static final int NOTEQ=35;
    public static final int LTHAN=36;
    public static final int GTHAN=37;
    public static final int LTHANE=38;
    public static final int GTHANE=39;
    public static final int PLUS=40;
    public static final int MINUS=41;
    public static final int CONCAT=42;
    public static final int MULT=43;
    public static final int DIV=44;
    public static final int POW=45;
    public static final int NOT=46;
    public static final int GET=47;
    public static final int KVPAIR=48;
    public static final int NUMBER=49;
    public static final int FPNUMBER=50;
    public static final int TRUE=51;
    public static final int FALSE=52;
    public static final int STRING=53;
    public static final int QUOTE=54;
    public static final int VAR=55;
    public static final int KEY=56;
    public static final int OBJECT=57;
    public static final int ARRAY=58;
    public static final int VOID=59;
    public static final int MULTILINE_COMMENT=60;
    public static final int COMMENT=61;
    public static final int LB=62;
    public static final int RB=63;
    public static final int DOT=64;
    public static final int NULL=65;
    public static final int US=66;
    public static final int BSLASH=67;
    public static final int AS=68;
    public static final int PRED=69;
    public static final int WS=70;
    public static final int DIGIT=71;

    // delegates
    // delegators


        public ImperaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ImperaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[83+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ImperaParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:31:1: program : globals -> ^( PROGRAM globals ) ;
    public final ImperaParser.program_return program() throws RecognitionException {
        ImperaParser.program_return retval = new ImperaParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        Object root_0 = null;

        ImperaParser.globals_return globals1 = null;


        RewriteRuleSubtreeStream stream_globals=new RewriteRuleSubtreeStream(adaptor,"rule globals");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:32:3: ( globals -> ^( PROGRAM globals ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:32:5: globals
            {
            pushFollow(FOLLOW_globals_in_program123);
            globals1=globals();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_globals.add(globals1.getTree());


            // AST REWRITE
            // elements: globals
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 32:13: -> ^( PROGRAM globals )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:32:16: ^( PROGRAM globals )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_globals.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class globals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "globals"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:35:1: globals : ( declaration )* ( function )* ;
    public final ImperaParser.globals_return globals() throws RecognitionException {
        ImperaParser.globals_return retval = new ImperaParser.globals_return();
        retval.start = input.LT(1);
        int globals_StartIndex = input.index();
        Object root_0 = null;

        ImperaParser.declaration_return declaration2 = null;

        ImperaParser.function_return function3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:36:3: ( ( declaration )* ( function )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:36:5: ( declaration )* ( function )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:36:5: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=VAR && LA1_0<=VOID)) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==ID) ) {
                        int LA1_3 = input.LA(3);

                        if ( ((LA1_3>=EQUAL && LA1_3<=SC)) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_globals146);
            	    declaration2=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:36:18: ( function )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=VAR && LA2_0<=VOID)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_globals149);
            	    function3=function();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, globals_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "globals"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:39:1: declaration : type ID ( EQUAL expr )? SC -> ^( DECL type ID ( EQUAL expr )? ) ;
    public final ImperaParser.declaration_return declaration() throws RecognitionException {
        ImperaParser.declaration_return retval = new ImperaParser.declaration_return();
        retval.start = input.LT(1);
        int declaration_StartIndex = input.index();
        Object root_0 = null;

        Token ID5=null;
        Token EQUAL6=null;
        Token SC8=null;
        ImperaParser.type_return type4 = null;

        ImperaParser.expr_return expr7 = null;


        Object ID5_tree=null;
        Object EQUAL6_tree=null;
        Object SC8_tree=null;
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:40:3: ( type ID ( EQUAL expr )? SC -> ^( DECL type ID ( EQUAL expr )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:40:5: type ID ( EQUAL expr )? SC
            {
            pushFollow(FOLLOW_type_in_declaration165);
            type4=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type4.getTree());
            ID5=(Token)match(input,ID,FOLLOW_ID_in_declaration167); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID5);

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:40:13: ( EQUAL expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:40:14: EQUAL expr
                    {
                    EQUAL6=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_declaration170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL6);

                    pushFollow(FOLLOW_expr_in_declaration172);
                    expr7=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr7.getTree());

                    }
                    break;

            }

            SC8=(Token)match(input,SC,FOLLOW_SC_in_declaration176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SC.add(SC8);



            // AST REWRITE
            // elements: ID, expr, EQUAL, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 40:30: -> ^( DECL type ID ( EQUAL expr )? )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:40:33: ^( DECL type ID ( EQUAL expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:40:48: ( EQUAL expr )?
                if ( stream_expr.hasNext()||stream_EQUAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_EQUAL.nextNode());
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();
                stream_EQUAL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, declaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:43:1: statement : ( assignment | printstatement | returnstatement | statcall | ifstatement | whilestatement | BREAK SC | CONTINUE SC );
    public final ImperaParser.statement_return statement() throws RecognitionException {
        ImperaParser.statement_return retval = new ImperaParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK15=null;
        Token SC16=null;
        Token CONTINUE17=null;
        Token SC18=null;
        ImperaParser.assignment_return assignment9 = null;

        ImperaParser.printstatement_return printstatement10 = null;

        ImperaParser.returnstatement_return returnstatement11 = null;

        ImperaParser.statcall_return statcall12 = null;

        ImperaParser.ifstatement_return ifstatement13 = null;

        ImperaParser.whilestatement_return whilestatement14 = null;


        Object BREAK15_tree=null;
        Object SC16_tree=null;
        Object CONTINUE17_tree=null;
        Object SC18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:44:3: ( assignment | printstatement | returnstatement | statcall | ifstatement | whilestatement | BREAK SC | CONTINUE SC )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:44:5: assignment
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement208);
                    assignment9=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:45:5: printstatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_printstatement_in_statement214);
                    printstatement10=printstatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printstatement10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:46:5: returnstatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnstatement_in_statement220);
                    returnstatement11=returnstatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnstatement11.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:47:5: statcall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statcall_in_statement226);
                    statcall12=statcall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statcall12.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:48:5: ifstatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifstatement_in_statement232);
                    ifstatement13=ifstatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifstatement13.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:49:5: whilestatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whilestatement_in_statement238);
                    whilestatement14=whilestatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whilestatement14.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:50:5: BREAK SC
                    {
                    root_0 = (Object)adaptor.nil();

                    BREAK15=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK15_tree = (Object)adaptor.create(BREAK15);
                    adaptor.addChild(root_0, BREAK15_tree);
                    }
                    SC16=(Token)match(input,SC,FOLLOW_SC_in_statement246); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:51:5: CONTINUE SC
                    {
                    root_0 = (Object)adaptor.nil();

                    CONTINUE17=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement253); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTINUE17_tree = (Object)adaptor.create(CONTINUE17);
                    adaptor.addChild(root_0, CONTINUE17_tree);
                    }
                    SC18=(Token)match(input,SC,FOLLOW_SC_in_statement255); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class whilestatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whilestatement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:54:1: whilestatement : WHILE LP expr RP block -> ^( WHILE expr block ) ;
    public final ImperaParser.whilestatement_return whilestatement() throws RecognitionException {
        ImperaParser.whilestatement_return retval = new ImperaParser.whilestatement_return();
        retval.start = input.LT(1);
        int whilestatement_StartIndex = input.index();
        Object root_0 = null;

        Token WHILE19=null;
        Token LP20=null;
        Token RP22=null;
        ImperaParser.expr_return expr21 = null;

        ImperaParser.block_return block23 = null;


        Object WHILE19_tree=null;
        Object LP20_tree=null;
        Object RP22_tree=null;
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:55:3: ( WHILE LP expr RP block -> ^( WHILE expr block ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:55:5: WHILE LP expr RP block
            {
            WHILE19=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilestatement271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE19);

            LP20=(Token)match(input,LP,FOLLOW_LP_in_whilestatement273); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LP.add(LP20);

            pushFollow(FOLLOW_expr_in_whilestatement275);
            expr21=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr21.getTree());
            RP22=(Token)match(input,RP,FOLLOW_RP_in_whilestatement277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RP.add(RP22);

            pushFollow(FOLLOW_block_in_whilestatement279);
            block23=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block23.getTree());


            // AST REWRITE
            // elements: expr, WHILE, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:28: -> ^( WHILE expr block )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:55:31: ^( WHILE expr block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, whilestatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whilestatement"

    public static class ifstatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifstatement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:58:1: ifstatement : IF LP expr RP block ( ELSE block )? -> ^( IF expr block ( ELSE block )? ) ;
    public final ImperaParser.ifstatement_return ifstatement() throws RecognitionException {
        ImperaParser.ifstatement_return retval = new ImperaParser.ifstatement_return();
        retval.start = input.LT(1);
        int ifstatement_StartIndex = input.index();
        Object root_0 = null;

        Token IF24=null;
        Token LP25=null;
        Token RP27=null;
        Token ELSE29=null;
        ImperaParser.expr_return expr26 = null;

        ImperaParser.block_return block28 = null;

        ImperaParser.block_return block30 = null;


        Object IF24_tree=null;
        Object LP25_tree=null;
        Object RP27_tree=null;
        Object ELSE29_tree=null;
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:59:3: ( IF LP expr RP block ( ELSE block )? -> ^( IF expr block ( ELSE block )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:59:5: IF LP expr RP block ( ELSE block )?
            {
            IF24=(Token)match(input,IF,FOLLOW_IF_in_ifstatement304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF24);

            LP25=(Token)match(input,LP,FOLLOW_LP_in_ifstatement306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LP.add(LP25);

            pushFollow(FOLLOW_expr_in_ifstatement308);
            expr26=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr26.getTree());
            RP27=(Token)match(input,RP,FOLLOW_RP_in_ifstatement310); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RP.add(RP27);

            pushFollow(FOLLOW_block_in_ifstatement312);
            block28=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block28.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:59:25: ( ELSE block )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ELSE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:59:26: ELSE block
                    {
                    ELSE29=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifstatement315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE29);

                    pushFollow(FOLLOW_block_in_ifstatement317);
                    block30=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block30.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: block, IF, ELSE, block, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:39: -> ^( IF expr block ( ELSE block )? )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:59:42: ^( IF expr block ( ELSE block )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:59:58: ( ELSE block )?
                if ( stream_block.hasNext()||stream_ELSE.hasNext() ) {
                    adaptor.addChild(root_1, stream_ELSE.nextNode());
                    adaptor.addChild(root_1, stream_block.nextTree());

                }
                stream_block.reset();
                stream_ELSE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, ifstatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifstatement"

    public static class returnstatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnstatement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:62:1: returnstatement : RETURN ( expr )? SC -> ^( RETURN ( expr )? ) ;
    public final ImperaParser.returnstatement_return returnstatement() throws RecognitionException {
        ImperaParser.returnstatement_return retval = new ImperaParser.returnstatement_return();
        retval.start = input.LT(1);
        int returnstatement_StartIndex = input.index();
        Object root_0 = null;

        Token RETURN31=null;
        Token SC33=null;
        ImperaParser.expr_return expr32 = null;


        Object RETURN31_tree=null;
        Object SC33_tree=null;
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:63:3: ( RETURN ( expr )? SC -> ^( RETURN ( expr )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:63:5: RETURN ( expr )? SC
            {
            RETURN31=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnstatement350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN31);

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:63:12: ( expr )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||LA6_0==LP||(LA6_0>=PLUS && LA6_0<=MINUS)||(LA6_0>=NOT && LA6_0<=GET)||(LA6_0>=NUMBER && LA6_0<=STRING)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:0:0: expr
                    {
                    pushFollow(FOLLOW_expr_in_returnstatement352);
                    expr32=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr32.getTree());

                    }
                    break;

            }

            SC33=(Token)match(input,SC,FOLLOW_SC_in_returnstatement355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SC.add(SC33);



            // AST REWRITE
            // elements: expr, RETURN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:21: -> ^( RETURN ( expr )? )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:63:24: ^( RETURN ( expr )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:63:33: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, returnstatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnstatement"

    public static class printstatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "printstatement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:66:1: printstatement : ( PRINT LP expr RP SC -> ^( PRINT expr ) | PRINTLN LP expr RP SC -> ^( PRINTLN expr ) );
    public final ImperaParser.printstatement_return printstatement() throws RecognitionException {
        ImperaParser.printstatement_return retval = new ImperaParser.printstatement_return();
        retval.start = input.LT(1);
        int printstatement_StartIndex = input.index();
        Object root_0 = null;

        Token PRINT34=null;
        Token LP35=null;
        Token RP37=null;
        Token SC38=null;
        Token PRINTLN39=null;
        Token LP40=null;
        Token RP42=null;
        Token SC43=null;
        ImperaParser.expr_return expr36 = null;

        ImperaParser.expr_return expr41 = null;


        Object PRINT34_tree=null;
        Object LP35_tree=null;
        Object RP37_tree=null;
        Object SC38_tree=null;
        Object PRINTLN39_tree=null;
        Object LP40_tree=null;
        Object RP42_tree=null;
        Object SC43_tree=null;
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleTokenStream stream_PRINTLN=new RewriteRuleTokenStream(adaptor,"token PRINTLN");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:67:3: ( PRINT LP expr RP SC -> ^( PRINT expr ) | PRINTLN LP expr RP SC -> ^( PRINTLN expr ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==PRINT) ) {
                alt7=1;
            }
            else if ( (LA7_0==PRINTLN) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:67:5: PRINT LP expr RP SC
                    {
                    PRINT34=(Token)match(input,PRINT,FOLLOW_PRINT_in_printstatement379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRINT.add(PRINT34);

                    LP35=(Token)match(input,LP,FOLLOW_LP_in_printstatement381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP35);

                    pushFollow(FOLLOW_expr_in_printstatement383);
                    expr36=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr36.getTree());
                    RP37=(Token)match(input,RP,FOLLOW_RP_in_printstatement385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP37);

                    SC38=(Token)match(input,SC,FOLLOW_SC_in_printstatement387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SC.add(SC38);



                    // AST REWRITE
                    // elements: expr, PRINT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:25: -> ^( PRINT expr )
                    {
                        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:67:28: ^( PRINT expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PRINT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:68:5: PRINTLN LP expr RP SC
                    {
                    PRINTLN39=(Token)match(input,PRINTLN,FOLLOW_PRINTLN_in_printstatement401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRINTLN.add(PRINTLN39);

                    LP40=(Token)match(input,LP,FOLLOW_LP_in_printstatement403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP40);

                    pushFollow(FOLLOW_expr_in_printstatement405);
                    expr41=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr41.getTree());
                    RP42=(Token)match(input,RP,FOLLOW_RP_in_printstatement407); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP42);

                    SC43=(Token)match(input,SC,FOLLOW_SC_in_printstatement409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SC.add(SC43);



                    // AST REWRITE
                    // elements: PRINTLN, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:27: -> ^( PRINTLN expr )
                    {
                        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:68:30: ^( PRINTLN expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_PRINTLN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, printstatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "printstatement"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:71:1: block : LBRACE ( declaration | statement )* RBRACE -> ^( BLOCK ( declaration )* ( statement )* ) ;
    public final ImperaParser.block_return block() throws RecognitionException {
        ImperaParser.block_return retval = new ImperaParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE44=null;
        Token RBRACE47=null;
        ImperaParser.declaration_return declaration45 = null;

        ImperaParser.statement_return statement46 = null;


        Object LBRACE44_tree=null;
        Object RBRACE47_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:72:3: ( LBRACE ( declaration | statement )* RBRACE -> ^( BLOCK ( declaration )* ( statement )* ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:72:5: LBRACE ( declaration | statement )* RBRACE
            {
            LBRACE44=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE44);

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:72:12: ( declaration | statement )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=VAR && LA8_0<=VOID)) ) {
                    alt8=1;
                }
                else if ( (LA8_0==ID||(LA8_0>=BREAK && LA8_0<=WHILE)||LA8_0==IF||(LA8_0>=RETURN && LA8_0<=PRINTLN)) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:72:13: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_block435);
            	    declaration45=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration45.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:72:25: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block437);
            	    statement46=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement46.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            RBRACE47=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block441); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE47);



            // AST REWRITE
            // elements: declaration, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:44: -> ^( BLOCK ( declaration )* ( statement )* )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:72:47: ^( BLOCK ( declaration )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:72:55: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:72:68: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:75:1: assignment : ( ID EQUAL expr SC -> ^( EQUAL ID expr ) | ID SET expr SC -> ^( SET ID expr ) );
    public final ImperaParser.assignment_return assignment() throws RecognitionException {
        ImperaParser.assignment_return retval = new ImperaParser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        Object root_0 = null;

        Token ID48=null;
        Token EQUAL49=null;
        Token SC51=null;
        Token ID52=null;
        Token SET53=null;
        Token SC55=null;
        ImperaParser.expr_return expr50 = null;

        ImperaParser.expr_return expr54 = null;


        Object ID48_tree=null;
        Object EQUAL49_tree=null;
        Object SC51_tree=null;
        Object ID52_tree=null;
        Object SET53_tree=null;
        Object SC55_tree=null;
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:76:3: ( ID EQUAL expr SC -> ^( EQUAL ID expr ) | ID SET expr SC -> ^( SET ID expr ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EQUAL) ) {
                    alt9=1;
                }
                else if ( (LA9_1==SET) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:76:5: ID EQUAL expr SC
                    {
                    ID48=(Token)match(input,ID,FOLLOW_ID_in_assignment468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID48);

                    EQUAL49=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignment470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL49);

                    pushFollow(FOLLOW_expr_in_assignment472);
                    expr50=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr50.getTree());
                    SC51=(Token)match(input,SC,FOLLOW_SC_in_assignment474); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SC.add(SC51);



                    // AST REWRITE
                    // elements: expr, ID, EQUAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:22: -> ^( EQUAL ID expr )
                    {
                        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:76:25: ^( EQUAL ID expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:77:5: ID SET expr SC
                    {
                    ID52=(Token)match(input,ID,FOLLOW_ID_in_assignment490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID52);

                    SET53=(Token)match(input,SET,FOLLOW_SET_in_assignment492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET53);

                    pushFollow(FOLLOW_expr_in_assignment494);
                    expr54=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr54.getTree());
                    SC55=(Token)match(input,SC,FOLLOW_SC_in_assignment496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SC.add(SC55);



                    // AST REWRITE
                    // elements: SET, ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:20: -> ^( SET ID expr )
                    {
                        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:77:23: ^( SET ID expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SET.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, assignment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:80:1: function : type ID LP ( params )? RP block -> ^( FUNCTION ^( ID type ) ( params )? block ) ;
    public final ImperaParser.function_return function() throws RecognitionException {
        ImperaParser.function_return retval = new ImperaParser.function_return();
        retval.start = input.LT(1);
        int function_StartIndex = input.index();
        Object root_0 = null;

        Token ID57=null;
        Token LP58=null;
        Token RP60=null;
        ImperaParser.type_return type56 = null;

        ImperaParser.params_return params59 = null;

        ImperaParser.block_return block61 = null;


        Object ID57_tree=null;
        Object LP58_tree=null;
        Object RP60_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:81:3: ( type ID LP ( params )? RP block -> ^( FUNCTION ^( ID type ) ( params )? block ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:81:5: type ID LP ( params )? RP block
            {
            pushFollow(FOLLOW_type_in_function521);
            type56=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type56.getTree());
            ID57=(Token)match(input,ID,FOLLOW_ID_in_function523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID57);

            LP58=(Token)match(input,LP,FOLLOW_LP_in_function525); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LP.add(LP58);

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:81:16: ( params )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=VAR && LA10_0<=VOID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:0:0: params
                    {
                    pushFollow(FOLLOW_params_in_function527);
                    params59=params();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_params.add(params59.getTree());

                    }
                    break;

            }

            RP60=(Token)match(input,RP,FOLLOW_RP_in_function530); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RP.add(RP60);

            pushFollow(FOLLOW_block_in_function532);
            block61=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block61.getTree());


            // AST REWRITE
            // elements: params, block, ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:33: -> ^( FUNCTION ^( ID type ) ( params )? block )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:81:36: ^( FUNCTION ^( ID type ) ( params )? block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:81:47: ^( ID type )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:81:58: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, function_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:83:1: params : parameter ( COMMA parameter )* -> ^( PARAMS ( parameter )* ) ;
    public final ImperaParser.params_return params() throws RecognitionException {
        ImperaParser.params_return retval = new ImperaParser.params_return();
        retval.start = input.LT(1);
        int params_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA63=null;
        ImperaParser.parameter_return parameter62 = null;

        ImperaParser.parameter_return parameter64 = null;


        Object COMMA63_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:84:3: ( parameter ( COMMA parameter )* -> ^( PARAMS ( parameter )* ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:84:5: parameter ( COMMA parameter )*
            {
            pushFollow(FOLLOW_parameter_in_params561);
            parameter62=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(parameter62.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:84:15: ( COMMA parameter )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:84:16: COMMA parameter
            	    {
            	    COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_params564); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA63);

            	    pushFollow(FOLLOW_parameter_in_params566);
            	    parameter64=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(parameter64.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:34: -> ^( PARAMS ( parameter )* )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:84:37: ^( PARAMS ( parameter )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);

                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:84:46: ( parameter )*
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, params_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:86:1: parameter : type ID -> ^( ID type ) ;
    public final ImperaParser.parameter_return parameter() throws RecognitionException {
        ImperaParser.parameter_return retval = new ImperaParser.parameter_return();
        retval.start = input.LT(1);
        int parameter_StartIndex = input.index();
        Object root_0 = null;

        Token ID66=null;
        ImperaParser.type_return type65 = null;


        Object ID66_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:87:3: ( type ID -> ^( ID type ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:87:5: type ID
            {
            pushFollow(FOLLOW_type_in_parameter589);
            type65=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type65.getTree());
            ID66=(Token)match(input,ID,FOLLOW_ID_in_parameter591); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID66);



            // AST REWRITE
            // elements: type, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:13: -> ^( ID type )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:87:16: ^( ID type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class statcall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statcall"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:90:1: statcall : ID LP ( args )? RP SC -> ^( CALL ID ( args )? ) ;
    public final ImperaParser.statcall_return statcall() throws RecognitionException {
        ImperaParser.statcall_return retval = new ImperaParser.statcall_return();
        retval.start = input.LT(1);
        int statcall_StartIndex = input.index();
        Object root_0 = null;

        Token ID67=null;
        Token LP68=null;
        Token RP70=null;
        Token SC71=null;
        ImperaParser.args_return args69 = null;


        Object ID67_tree=null;
        Object LP68_tree=null;
        Object RP70_tree=null;
        Object SC71_tree=null;
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:91:3: ( ID LP ( args )? RP SC -> ^( CALL ID ( args )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:91:5: ID LP ( args )? RP SC
            {
            ID67=(Token)match(input,ID,FOLLOW_ID_in_statcall614); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID67);

            LP68=(Token)match(input,LP,FOLLOW_LP_in_statcall616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LP.add(LP68);

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:91:11: ( args )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID||LA12_0==LP||(LA12_0>=PLUS && LA12_0<=MINUS)||(LA12_0>=NOT && LA12_0<=GET)||(LA12_0>=NUMBER && LA12_0<=STRING)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_statcall618);
                    args69=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_args.add(args69.getTree());

                    }
                    break;

            }

            RP70=(Token)match(input,RP,FOLLOW_RP_in_statcall621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RP.add(RP70);

            SC71=(Token)match(input,SC,FOLLOW_SC_in_statcall623); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SC.add(SC71);



            // AST REWRITE
            // elements: ID, args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:23: -> ^( CALL ID ( args )? )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:91:26: ^( CALL ID ( args )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:91:36: ( args )?
                if ( stream_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_args.nextTree());

                }
                stream_args.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, statcall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statcall"

    public static class exprcall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprcall"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:93:1: exprcall : ID LP ( args )? RP -> ^( CALL ID ( args )? ) ;
    public final ImperaParser.exprcall_return exprcall() throws RecognitionException {
        ImperaParser.exprcall_return retval = new ImperaParser.exprcall_return();
        retval.start = input.LT(1);
        int exprcall_StartIndex = input.index();
        Object root_0 = null;

        Token ID72=null;
        Token LP73=null;
        Token RP75=null;
        ImperaParser.args_return args74 = null;


        Object ID72_tree=null;
        Object LP73_tree=null;
        Object RP75_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:94:3: ( ID LP ( args )? RP -> ^( CALL ID ( args )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:94:5: ID LP ( args )? RP
            {
            ID72=(Token)match(input,ID,FOLLOW_ID_in_exprcall646); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID72);

            LP73=(Token)match(input,LP,FOLLOW_LP_in_exprcall648); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LP.add(LP73);

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:94:11: ( args )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID||LA13_0==LP||(LA13_0>=PLUS && LA13_0<=MINUS)||(LA13_0>=NOT && LA13_0<=GET)||(LA13_0>=NUMBER && LA13_0<=STRING)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:0:0: args
                    {
                    pushFollow(FOLLOW_args_in_exprcall650);
                    args74=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_args.add(args74.getTree());

                    }
                    break;

            }

            RP75=(Token)match(input,RP,FOLLOW_RP_in_exprcall653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RP.add(RP75);



            // AST REWRITE
            // elements: ID, args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:20: -> ^( CALL ID ( args )? )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:94:23: ^( CALL ID ( args )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:94:33: ( args )?
                if ( stream_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_args.nextTree());

                }
                stream_args.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, exprcall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprcall"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:96:1: args : expr ( COMMA expr )* -> ^( ARGS ( expr )* ) ;
    public final ImperaParser.args_return args() throws RecognitionException {
        ImperaParser.args_return retval = new ImperaParser.args_return();
        retval.start = input.LT(1);
        int args_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA77=null;
        ImperaParser.expr_return expr76 = null;

        ImperaParser.expr_return expr78 = null;


        Object COMMA77_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:97:3: ( expr ( COMMA expr )* -> ^( ARGS ( expr )* ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:97:5: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_args676);
            expr76=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr76.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:97:10: ( COMMA expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:97:11: COMMA expr
            	    {
            	    COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_args679); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA77);

            	    pushFollow(FOLLOW_expr_in_args681);
            	    expr78=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr78.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 97:24: -> ^( ARGS ( expr )* )
            {
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:97:27: ^( ARGS ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:97:34: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, args_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:100:1: expr : orexpr ;
    public final ImperaParser.expr_return expr() throws RecognitionException {
        ImperaParser.expr_return retval = new ImperaParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        ImperaParser.orexpr_return orexpr79 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:101:3: ( orexpr )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:101:5: orexpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_orexpr_in_expr707);
            orexpr79=orexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, orexpr79.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class orexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orexpr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:103:1: orexpr : andexpr ( ( XOR | OR ) andexpr )* ;
    public final ImperaParser.orexpr_return orexpr() throws RecognitionException {
        ImperaParser.orexpr_return retval = new ImperaParser.orexpr_return();
        retval.start = input.LT(1);
        int orexpr_StartIndex = input.index();
        Object root_0 = null;

        Token set81=null;
        ImperaParser.andexpr_return andexpr80 = null;

        ImperaParser.andexpr_return andexpr82 = null;


        Object set81_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:104:3: ( andexpr ( ( XOR | OR ) andexpr )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:104:5: andexpr ( ( XOR | OR ) andexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andexpr_in_orexpr719);
            andexpr80=andexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andexpr80.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:104:13: ( ( XOR | OR ) andexpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=XOR && LA15_0<=OR)) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred23_Impera()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:104:14: ( XOR | OR ) andexpr
            	    {
            	    set81=(Token)input.LT(1);
            	    set81=(Token)input.LT(1);
            	    if ( (input.LA(1)>=XOR && input.LA(1)<=OR) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set81), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_andexpr_in_orexpr729);
            	    andexpr82=andexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andexpr82.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, orexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "orexpr"

    public static class andexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andexpr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:106:1: andexpr : eqexpr ( AND eqexpr )* ;
    public final ImperaParser.andexpr_return andexpr() throws RecognitionException {
        ImperaParser.andexpr_return retval = new ImperaParser.andexpr_return();
        retval.start = input.LT(1);
        int andexpr_StartIndex = input.index();
        Object root_0 = null;

        Token AND84=null;
        ImperaParser.eqexpr_return eqexpr83 = null;

        ImperaParser.eqexpr_return eqexpr85 = null;


        Object AND84_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:107:3: ( eqexpr ( AND eqexpr )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:107:5: eqexpr ( AND eqexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_eqexpr_in_andexpr743);
            eqexpr83=eqexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, eqexpr83.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:107:12: ( AND eqexpr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AND) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred24_Impera()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:107:13: AND eqexpr
            	    {
            	    AND84=(Token)match(input,AND,FOLLOW_AND_in_andexpr746); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND84_tree = (Object)adaptor.create(AND84);
            	    root_0 = (Object)adaptor.becomeRoot(AND84_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_eqexpr_in_andexpr749);
            	    eqexpr85=eqexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, eqexpr85.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, andexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "andexpr"

    public static class eqexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eqexpr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:109:1: eqexpr : relexpr ( ( EQUIV | NOTEQ ) relexpr )* ;
    public final ImperaParser.eqexpr_return eqexpr() throws RecognitionException {
        ImperaParser.eqexpr_return retval = new ImperaParser.eqexpr_return();
        retval.start = input.LT(1);
        int eqexpr_StartIndex = input.index();
        Object root_0 = null;

        Token set87=null;
        ImperaParser.relexpr_return relexpr86 = null;

        ImperaParser.relexpr_return relexpr88 = null;


        Object set87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:110:3: ( relexpr ( ( EQUIV | NOTEQ ) relexpr )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:110:5: relexpr ( ( EQUIV | NOTEQ ) relexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relexpr_in_eqexpr763);
            relexpr86=relexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relexpr86.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:110:13: ( ( EQUIV | NOTEQ ) relexpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=EQUIV && LA17_0<=NOTEQ)) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred26_Impera()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:110:14: ( EQUIV | NOTEQ ) relexpr
            	    {
            	    set87=(Token)input.LT(1);
            	    set87=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQUIV && input.LA(1)<=NOTEQ) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set87), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relexpr_in_eqexpr773);
            	    relexpr88=relexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relexpr88.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, eqexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "eqexpr"

    public static class relexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relexpr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:112:1: relexpr : plusexpr ( ( LTHAN | GTHAN | LTHANE | GTHANE ) plusexpr )* ;
    public final ImperaParser.relexpr_return relexpr() throws RecognitionException {
        ImperaParser.relexpr_return retval = new ImperaParser.relexpr_return();
        retval.start = input.LT(1);
        int relexpr_StartIndex = input.index();
        Object root_0 = null;

        Token set90=null;
        ImperaParser.plusexpr_return plusexpr89 = null;

        ImperaParser.plusexpr_return plusexpr91 = null;


        Object set90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:113:3: ( plusexpr ( ( LTHAN | GTHAN | LTHANE | GTHANE ) plusexpr )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:113:5: plusexpr ( ( LTHAN | GTHAN | LTHANE | GTHANE ) plusexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_plusexpr_in_relexpr787);
            plusexpr89=plusexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusexpr89.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:113:14: ( ( LTHAN | GTHAN | LTHANE | GTHANE ) plusexpr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=LTHAN && LA18_0<=GTHANE)) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred30_Impera()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:113:15: ( LTHAN | GTHAN | LTHANE | GTHANE ) plusexpr
            	    {
            	    set90=(Token)input.LT(1);
            	    set90=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LTHAN && input.LA(1)<=GTHANE) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set90), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_plusexpr_in_relexpr801);
            	    plusexpr91=plusexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, plusexpr91.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, relexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relexpr"

    public static class plusexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plusexpr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:115:1: plusexpr : multexpr ( ( PLUS | MINUS | CONCAT ) multexpr )* ;
    public final ImperaParser.plusexpr_return plusexpr() throws RecognitionException {
        ImperaParser.plusexpr_return retval = new ImperaParser.plusexpr_return();
        retval.start = input.LT(1);
        int plusexpr_StartIndex = input.index();
        Object root_0 = null;

        Token set93=null;
        ImperaParser.multexpr_return multexpr92 = null;

        ImperaParser.multexpr_return multexpr94 = null;


        Object set93_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:116:3: ( multexpr ( ( PLUS | MINUS | CONCAT ) multexpr )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:116:5: multexpr ( ( PLUS | MINUS | CONCAT ) multexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multexpr_in_plusexpr815);
            multexpr92=multexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multexpr92.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:116:14: ( ( PLUS | MINUS | CONCAT ) multexpr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=PLUS && LA19_0<=CONCAT)) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred33_Impera()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:116:15: ( PLUS | MINUS | CONCAT ) multexpr
            	    {
            	    set93=(Token)input.LT(1);
            	    set93=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=CONCAT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set93), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multexpr_in_plusexpr827);
            	    multexpr94=multexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multexpr94.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, plusexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "plusexpr"

    public static class multexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multexpr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:118:1: multexpr : powexpr ( ( MULT | DIV ) powexpr )* ;
    public final ImperaParser.multexpr_return multexpr() throws RecognitionException {
        ImperaParser.multexpr_return retval = new ImperaParser.multexpr_return();
        retval.start = input.LT(1);
        int multexpr_StartIndex = input.index();
        Object root_0 = null;

        Token set96=null;
        ImperaParser.powexpr_return powexpr95 = null;

        ImperaParser.powexpr_return powexpr97 = null;


        Object set96_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:119:3: ( powexpr ( ( MULT | DIV ) powexpr )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:119:5: powexpr ( ( MULT | DIV ) powexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powexpr_in_multexpr841);
            powexpr95=powexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, powexpr95.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:119:13: ( ( MULT | DIV ) powexpr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=MULT && LA20_0<=DIV)) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred35_Impera()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:119:14: ( MULT | DIV ) powexpr
            	    {
            	    set96=(Token)input.LT(1);
            	    set96=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set96), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powexpr_in_multexpr851);
            	    powexpr97=powexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, powexpr97.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, multexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multexpr"

    public static class powexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "powexpr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:121:1: powexpr : unaryexpr ( POW unaryexpr )* ;
    public final ImperaParser.powexpr_return powexpr() throws RecognitionException {
        ImperaParser.powexpr_return retval = new ImperaParser.powexpr_return();
        retval.start = input.LT(1);
        int powexpr_StartIndex = input.index();
        Object root_0 = null;

        Token POW99=null;
        ImperaParser.unaryexpr_return unaryexpr98 = null;

        ImperaParser.unaryexpr_return unaryexpr100 = null;


        Object POW99_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:122:3: ( unaryexpr ( POW unaryexpr )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:122:5: unaryexpr ( POW unaryexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryexpr_in_powexpr865);
            unaryexpr98=unaryexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryexpr98.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:122:15: ( POW unaryexpr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==POW) ) {
                    int LA21_2 = input.LA(2);

                    if ( (synpred36_Impera()) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:122:16: POW unaryexpr
            	    {
            	    POW99=(Token)match(input,POW,FOLLOW_POW_in_powexpr868); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POW99_tree = (Object)adaptor.create(POW99);
            	    root_0 = (Object)adaptor.becomeRoot(POW99_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_unaryexpr_in_powexpr871);
            	    unaryexpr100=unaryexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryexpr100.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, powexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "powexpr"

    public static class unaryexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryexpr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:125:1: unaryexpr : ( PLUS unaryexpr -> ^( POS unaryexpr ) | MINUS unaryexpr -> ^( NEG unaryexpr ) | NOT unaryexpr | GET catom | catom );
    public final ImperaParser.unaryexpr_return unaryexpr() throws RecognitionException {
        ImperaParser.unaryexpr_return retval = new ImperaParser.unaryexpr_return();
        retval.start = input.LT(1);
        int unaryexpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS101=null;
        Token MINUS103=null;
        Token NOT105=null;
        Token GET107=null;
        ImperaParser.unaryexpr_return unaryexpr102 = null;

        ImperaParser.unaryexpr_return unaryexpr104 = null;

        ImperaParser.unaryexpr_return unaryexpr106 = null;

        ImperaParser.catom_return catom108 = null;

        ImperaParser.catom_return catom109 = null;


        Object PLUS101_tree=null;
        Object MINUS103_tree=null;
        Object NOT105_tree=null;
        Object GET107_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_unaryexpr=new RewriteRuleSubtreeStream(adaptor,"rule unaryexpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:126:3: ( PLUS unaryexpr -> ^( POS unaryexpr ) | MINUS unaryexpr -> ^( NEG unaryexpr ) | NOT unaryexpr | GET catom | catom )
            int alt22=5;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt22=1;
                }
                break;
            case MINUS:
                {
                alt22=2;
                }
                break;
            case NOT:
                {
                alt22=3;
                }
                break;
            case GET:
                {
                alt22=4;
                }
                break;
            case ID:
            case LP:
            case NUMBER:
            case FPNUMBER:
            case TRUE:
            case FALSE:
            case STRING:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:126:5: PLUS unaryexpr
                    {
                    PLUS101=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryexpr886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS101);

                    pushFollow(FOLLOW_unaryexpr_in_unaryexpr888);
                    unaryexpr102=unaryexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryexpr.add(unaryexpr102.getTree());


                    // AST REWRITE
                    // elements: unaryexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:20: -> ^( POS unaryexpr )
                    {
                        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:126:23: ^( POS unaryexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POS, "POS"), root_1);

                        adaptor.addChild(root_1, stream_unaryexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:127:5: MINUS unaryexpr
                    {
                    MINUS103=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryexpr902); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS103);

                    pushFollow(FOLLOW_unaryexpr_in_unaryexpr904);
                    unaryexpr104=unaryexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unaryexpr.add(unaryexpr104.getTree());


                    // AST REWRITE
                    // elements: unaryexpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 127:21: -> ^( NEG unaryexpr )
                    {
                        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:127:24: ^( NEG unaryexpr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEG, "NEG"), root_1);

                        adaptor.addChild(root_1, stream_unaryexpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:128:5: NOT unaryexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT105=(Token)match(input,NOT,FOLLOW_NOT_in_unaryexpr918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT105_tree = (Object)adaptor.create(NOT105);
                    root_0 = (Object)adaptor.becomeRoot(NOT105_tree, root_0);
                    }
                    pushFollow(FOLLOW_unaryexpr_in_unaryexpr921);
                    unaryexpr106=unaryexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryexpr106.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:129:5: GET catom
                    {
                    root_0 = (Object)adaptor.nil();

                    GET107=(Token)match(input,GET,FOLLOW_GET_in_unaryexpr927); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GET107_tree = (Object)adaptor.create(GET107);
                    root_0 = (Object)adaptor.becomeRoot(GET107_tree, root_0);
                    }
                    pushFollow(FOLLOW_catom_in_unaryexpr930);
                    catom108=catom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catom108.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:130:5: catom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_catom_in_unaryexpr936);
                    catom109=catom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catom109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, unaryexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryexpr"

    public static class catom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catom"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:133:1: catom : atom ( KVPAIR atom )? ;
    public final ImperaParser.catom_return catom() throws RecognitionException {
        ImperaParser.catom_return retval = new ImperaParser.catom_return();
        retval.start = input.LT(1);
        int catom_StartIndex = input.index();
        Object root_0 = null;

        Token KVPAIR111=null;
        ImperaParser.atom_return atom110 = null;

        ImperaParser.atom_return atom112 = null;


        Object KVPAIR111_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:134:3: ( atom ( KVPAIR atom )? )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:134:5: atom ( KVPAIR atom )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_catom951);
            atom110=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atom110.getTree());
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:134:10: ( KVPAIR atom )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KVPAIR) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred41_Impera()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:134:11: KVPAIR atom
                    {
                    KVPAIR111=(Token)match(input,KVPAIR,FOLLOW_KVPAIR_in_catom954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KVPAIR111_tree = (Object)adaptor.create(KVPAIR111);
                    root_0 = (Object)adaptor.becomeRoot(KVPAIR111_tree, root_0);
                    }
                    pushFollow(FOLLOW_atom_in_catom957);
                    atom112=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom112.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, catom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catom"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:137:1: atom : ( LP expr RP | LP type RP e= expr -> ^( CAST type $e) | exprcall | NUMBER | FPNUMBER | TRUE | FALSE | STRING | ID );
    public final ImperaParser.atom_return atom() throws RecognitionException {
        ImperaParser.atom_return retval = new ImperaParser.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        Object root_0 = null;

        Token LP113=null;
        Token RP115=null;
        Token LP116=null;
        Token RP118=null;
        Token NUMBER120=null;
        Token FPNUMBER121=null;
        Token TRUE122=null;
        Token FALSE123=null;
        Token STRING124=null;
        Token ID125=null;
        ImperaParser.expr_return e = null;

        ImperaParser.expr_return expr114 = null;

        ImperaParser.type_return type117 = null;

        ImperaParser.exprcall_return exprcall119 = null;


        Object LP113_tree=null;
        Object RP115_tree=null;
        Object LP116_tree=null;
        Object RP118_tree=null;
        Object NUMBER120_tree=null;
        Object FPNUMBER121_tree=null;
        Object TRUE122_tree=null;
        Object FALSE123_tree=null;
        Object STRING124_tree=null;
        Object ID125_tree=null;
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:138:3: ( LP expr RP | LP type RP e= expr -> ^( CAST type $e) | exprcall | NUMBER | FPNUMBER | TRUE | FALSE | STRING | ID )
            int alt24=9;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:138:5: LP expr RP
                    {
                    root_0 = (Object)adaptor.nil();

                    LP113=(Token)match(input,LP,FOLLOW_LP_in_atom972); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_atom975);
                    expr114=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());
                    RP115=(Token)match(input,RP,FOLLOW_RP_in_atom977); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:139:5: LP type RP e= expr
                    {
                    LP116=(Token)match(input,LP,FOLLOW_LP_in_atom984); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP116);

                    pushFollow(FOLLOW_type_in_atom986);
                    type117=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type117.getTree());
                    RP118=(Token)match(input,RP,FOLLOW_RP_in_atom988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP118);

                    pushFollow(FOLLOW_expr_in_atom992);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(e.getTree());


                    // AST REWRITE
                    // elements: e, type
                    // token labels: 
                    // rule labels: retval, e
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:23: -> ^( CAST type $e)
                    {
                        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:139:26: ^( CAST type $e)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, "CAST"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_e.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:140:5: exprcall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exprcall_in_atom1009);
                    exprcall119=exprcall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprcall119.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:141:5: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER120=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom1015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER120_tree = (Object)adaptor.create(NUMBER120);
                    adaptor.addChild(root_0, NUMBER120_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:142:5: FPNUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    FPNUMBER121=(Token)match(input,FPNUMBER,FOLLOW_FPNUMBER_in_atom1021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FPNUMBER121_tree = (Object)adaptor.create(FPNUMBER121);
                    adaptor.addChild(root_0, FPNUMBER121_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:143:5: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE122=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE122_tree = (Object)adaptor.create(TRUE122);
                    adaptor.addChild(root_0, TRUE122_tree);
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:144:5: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE123=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1033); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE123_tree = (Object)adaptor.create(FALSE123);
                    adaptor.addChild(root_0, FALSE123_tree);
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:145:5: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING124=(Token)match(input,STRING,FOLLOW_STRING_in_atom1039); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING124_tree = (Object)adaptor.create(STRING124);
                    adaptor.addChild(root_0, STRING124_tree);
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:146:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID125=(Token)match(input,ID,FOLLOW_ID_in_atom1045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID125_tree = (Object)adaptor.create(ID125);
                    adaptor.addChild(root_0, ID125_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:148:1: string : QUOTE ( . )* QUOTE ;
    public final ImperaParser.string_return string() throws RecognitionException {
        ImperaParser.string_return retval = new ImperaParser.string_return();
        retval.start = input.LT(1);
        int string_StartIndex = input.index();
        Object root_0 = null;

        Token QUOTE126=null;
        Token wildcard127=null;
        Token QUOTE128=null;

        Object QUOTE126_tree=null;
        Object wildcard127_tree=null;
        Object QUOTE128_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:149:3: ( QUOTE ( . )* QUOTE )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:149:5: QUOTE ( . )* QUOTE
            {
            root_0 = (Object)adaptor.nil();

            QUOTE126=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_string1057); if (state.failed) return retval;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:149:12: ( . )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==QUOTE) ) {
                    int LA25_1 = input.LA(2);

                    if ( ((LA25_1>=PROGRAM && LA25_1<=DIGIT)) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>=PROGRAM && LA25_0<=STRING)||(LA25_0>=VAR && LA25_0<=DIGIT)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:0:0: .
            	    {
            	    wildcard127=(Token)input.LT(1);
            	    matchAny(input); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    wildcard127_tree = (Object)adaptor.create(wildcard127);
            	    adaptor.addChild(root_0, wildcard127_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            QUOTE128=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_string1063); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, string_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:152:1: type : ( VAR | KEY | OBJECT | ARRAY | VOID );
    public final ImperaParser.type_return type() throws RecognitionException {
        ImperaParser.type_return retval = new ImperaParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token set129=null;

        Object set129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:153:3: ( VAR | KEY | OBJECT | ARRAY | VOID )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:
            {
            root_0 = (Object)adaptor.nil();

            set129=(Token)input.LT(1);
            if ( (input.LA(1)>=VAR && input.LA(1)<=VOID) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set129));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred23_Impera
    public final void synpred23_Impera_fragment() throws RecognitionException {   
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:104:14: ( ( XOR | OR ) andexpr )
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:104:14: ( XOR | OR ) andexpr
        {
        if ( (input.LA(1)>=XOR && input.LA(1)<=OR) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_andexpr_in_synpred23_Impera729);
        andexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Impera

    // $ANTLR start synpred24_Impera
    public final void synpred24_Impera_fragment() throws RecognitionException {   
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:107:13: ( AND eqexpr )
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:107:13: AND eqexpr
        {
        match(input,AND,FOLLOW_AND_in_synpred24_Impera746); if (state.failed) return ;
        pushFollow(FOLLOW_eqexpr_in_synpred24_Impera749);
        eqexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_Impera

    // $ANTLR start synpred26_Impera
    public final void synpred26_Impera_fragment() throws RecognitionException {   
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:110:14: ( ( EQUIV | NOTEQ ) relexpr )
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:110:14: ( EQUIV | NOTEQ ) relexpr
        {
        if ( (input.LA(1)>=EQUIV && input.LA(1)<=NOTEQ) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_relexpr_in_synpred26_Impera773);
        relexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Impera

    // $ANTLR start synpred30_Impera
    public final void synpred30_Impera_fragment() throws RecognitionException {   
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:113:15: ( ( LTHAN | GTHAN | LTHANE | GTHANE ) plusexpr )
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:113:15: ( LTHAN | GTHAN | LTHANE | GTHANE ) plusexpr
        {
        if ( (input.LA(1)>=LTHAN && input.LA(1)<=GTHANE) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_plusexpr_in_synpred30_Impera801);
        plusexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Impera

    // $ANTLR start synpred33_Impera
    public final void synpred33_Impera_fragment() throws RecognitionException {   
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:116:15: ( ( PLUS | MINUS | CONCAT ) multexpr )
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:116:15: ( PLUS | MINUS | CONCAT ) multexpr
        {
        if ( (input.LA(1)>=PLUS && input.LA(1)<=CONCAT) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_multexpr_in_synpred33_Impera827);
        multexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Impera

    // $ANTLR start synpred35_Impera
    public final void synpred35_Impera_fragment() throws RecognitionException {   
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:119:14: ( ( MULT | DIV ) powexpr )
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:119:14: ( MULT | DIV ) powexpr
        {
        if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_powexpr_in_synpred35_Impera851);
        powexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_Impera

    // $ANTLR start synpred36_Impera
    public final void synpred36_Impera_fragment() throws RecognitionException {   
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:122:16: ( POW unaryexpr )
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:122:16: POW unaryexpr
        {
        match(input,POW,FOLLOW_POW_in_synpred36_Impera868); if (state.failed) return ;
        pushFollow(FOLLOW_unaryexpr_in_synpred36_Impera871);
        unaryexpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Impera

    // $ANTLR start synpred41_Impera
    public final void synpred41_Impera_fragment() throws RecognitionException {   
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:134:11: ( KVPAIR atom )
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:134:11: KVPAIR atom
        {
        match(input,KVPAIR,FOLLOW_KVPAIR_in_synpred41_Impera954); if (state.failed) return ;
        pushFollow(FOLLOW_atom_in_synpred41_Impera957);
        atom();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_Impera

    // Delegated rules

    public final boolean synpred23_Impera() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Impera_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Impera() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Impera_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_Impera() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_Impera_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Impera() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Impera_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_Impera() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Impera_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_Impera() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_Impera_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_Impera() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_Impera_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_Impera() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_Impera_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\16\1\17\10\uffff";
    static final String DFA4_maxS =
        "\1\32\1\35\10\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\1\5\1\6\1\7\1\10\1\1\1\4";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\2\uffff\1\6\1\7\1\5\2\uffff\1\4\1\uffff\1\3\2\2",
            "\1\10\4\uffff\1\11\10\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "43:1: statement : ( assignment | printstatement | returnstatement | statcall | ifstatement | whilestatement | BREAK SC | CONTINUE SC );";
        }
    }
    static final String DFA24_eotS =
        "\14\uffff";
    static final String DFA24_eofS =
        "\2\uffff\1\13\11\uffff";
    static final String DFA24_minS =
        "\2\16\1\20\11\uffff";
    static final String DFA24_maxS =
        "\1\65\1\73\1\60\11\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\4\1\5\1\6\1\7\1\10\1\1\1\2\1\3\1\11";
    static final String DFA24_specialS =
        "\14\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\5\uffff\1\1\34\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\10\5\uffff\1\10\23\uffff\2\10\4\uffff\2\10\1\uffff\5\10"+
            "\1\uffff\5\11",
            "\1\13\3\uffff\1\12\1\13\10\uffff\20\13\2\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "137:1: atom : ( LP expr RP | LP type RP e= expr -> ^( CAST type $e) | exprcall | NUMBER | FPNUMBER | TRUE | FALSE | STRING | ID );";
        }
    }
 

    public static final BitSet FOLLOW_globals_in_program123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_globals146 = new BitSet(new long[]{0x0F80000000000002L});
    public static final BitSet FOLLOW_function_in_globals149 = new BitSet(new long[]{0x0F80000000000002L});
    public static final BitSet FOLLOW_type_in_declaration165 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_declaration167 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_EQUAL_in_declaration170 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_declaration172 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_declaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_statement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statcall_in_statement226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement244 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_statement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement253 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_statement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilestatement271 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LP_in_whilestatement273 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_whilestatement275 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_whilestatement277 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_block_in_whilestatement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstatement304 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LP_in_ifstatement306 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_ifstatement308 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_ifstatement310 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_block_in_ifstatement312 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement315 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_block_in_ifstatement317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnstatement350 = new BitSet(new long[]{0x003EC30000114000L});
    public static final BitSet FOLLOW_expr_in_returnstatement352 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_returnstatement355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_printstatement379 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LP_in_printstatement381 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_printstatement383 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_printstatement385 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_printstatement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINTLN_in_printstatement401 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LP_in_printstatement403 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_printstatement405 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_printstatement407 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_printstatement409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block432 = new BitSet(new long[]{0x0F800000174E4000L});
    public static final BitSet FOLLOW_declaration_in_block435 = new BitSet(new long[]{0x0F800000174E4000L});
    public static final BitSet FOLLOW_statement_in_block437 = new BitSet(new long[]{0x0F800000174E4000L});
    public static final BitSet FOLLOW_RBRACE_in_block441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment468 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assignment470 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_assignment472 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_assignment474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment490 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SET_in_assignment492 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_assignment494 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_assignment496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_function521 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_function523 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LP_in_function525 = new BitSet(new long[]{0x0F80000000200000L});
    public static final BitSet FOLLOW_params_in_function527 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_function530 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_block_in_function532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_params561 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_params564 = new BitSet(new long[]{0x0F80000000000000L});
    public static final BitSet FOLLOW_parameter_in_params566 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_type_in_parameter589 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_parameter591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statcall614 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LP_in_statcall616 = new BitSet(new long[]{0x003EC30000304000L});
    public static final BitSet FOLLOW_args_in_statcall618 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_statcall621 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SC_in_statcall623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_exprcall646 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_LP_in_exprcall648 = new BitSet(new long[]{0x003EC30000304000L});
    public static final BitSet FOLLOW_args_in_exprcall650 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_exprcall653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args676 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_args679 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_args681 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_orexpr_in_expr707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpr_in_orexpr719 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_orexpr722 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_andexpr_in_orexpr729 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_eqexpr_in_andexpr743 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_AND_in_andexpr746 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_eqexpr_in_andexpr749 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_relexpr_in_eqexpr763 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_eqexpr766 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_relexpr_in_eqexpr773 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_plusexpr_in_relexpr787 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_set_in_relexpr790 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_plusexpr_in_relexpr801 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_multexpr_in_plusexpr815 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_set_in_plusexpr818 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_multexpr_in_plusexpr827 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_powexpr_in_multexpr841 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_set_in_multexpr844 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_powexpr_in_multexpr851 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_unaryexpr_in_powexpr865 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_POW_in_powexpr868 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_unaryexpr_in_powexpr871 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryexpr886 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_unaryexpr_in_unaryexpr888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryexpr902 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_unaryexpr_in_unaryexpr904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryexpr918 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_unaryexpr_in_unaryexpr921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_unaryexpr927 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_catom_in_unaryexpr930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catom_in_unaryexpr936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_catom951 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_KVPAIR_in_catom954 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_atom_in_catom957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom972 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_atom975 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_atom977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom984 = new BitSet(new long[]{0x0F80000000000000L});
    public static final BitSet FOLLOW_type_in_atom986 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RP_in_atom988 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_expr_in_atom992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprcall_in_atom1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPNUMBER_in_atom1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_string1057 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000000000FFL});
    public static final BitSet FOLLOW_QUOTE_in_string1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred23_Impera722 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_andexpr_in_synpred23_Impera729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_synpred24_Impera746 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_eqexpr_in_synpred24_Impera749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred26_Impera766 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_relexpr_in_synpred26_Impera773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred30_Impera790 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_plusexpr_in_synpred30_Impera801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred33_Impera818 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_multexpr_in_synpred33_Impera827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred35_Impera844 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_powexpr_in_synpred35_Impera851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POW_in_synpred36_Impera868 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_unaryexpr_in_synpred36_Impera871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KVPAIR_in_synpred41_Impera954 = new BitSet(new long[]{0x003EC30000104000L});
    public static final BitSet FOLLOW_atom_in_synpred41_Impera957 = new BitSet(new long[]{0x0000000000000002L});

}