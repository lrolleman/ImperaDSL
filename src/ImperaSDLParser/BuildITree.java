// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g 2015-05-14 11:21:22

package ImperaSDLParser;

import Global.*;
import Expressions.*;
import Statements.*;
import SymbolTable.*;
import ImperaExceptions.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BuildITree extends TreeParser {
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


        public BuildITree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public BuildITree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return BuildITree.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g"; }


      SymbolTable symtab;
      public BuildITree(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
        PersistentData.scopestack.push(symtab.getGlobalScope());
      }
      private CommonTree getErrorHeader() {
        return (CommonTree) input.LT(1);
      }



    // $ANTLR start "program"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:31:1: program returns [Root root] : ^( PROGRAM g= globals ) ;
    public final Root program() throws RecognitionException {
        Root root = null;

        ArrayList<Statement> g = null;


        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:35:3: ( ^( PROGRAM g= globals ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:35:5: ^( PROGRAM g= globals )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program68); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_globals_in_program72);
                g=globals();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }


              root = new Root(g);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return root;
    }
    // $ANTLR end "program"


    // $ANTLR start "globals"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:38:1: globals returns [ArrayList<Statement> gdecl] : (d= declaration )* (f= function )* ;
    public final ArrayList<Statement> globals() throws RecognitionException {
        ArrayList<Statement> gdecl = null;

        Statement d = null;

        Function f = null;



          ArrayList<Statement> decl = new ArrayList<Statement>();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:45:3: ( (d= declaration )* (f= function )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:45:5: (d= declaration )* (f= function )*
            {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:45:5: (d= declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:45:6: d= declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_globals105);
            	    d=declaration();

            	    state._fsp--;

            	    decl.add(d);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:45:43: (f= function )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FUNCTION) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:45:44: f= function
            	    {
            	    pushFollow(FOLLOW_function_in_globals114);
            	    f=function();

            	    state._fsp--;

            	    PersistentData.scopestack.peek().define(f);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


              gdecl = decl;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return gdecl;
    }
    // $ANTLR end "globals"


    // $ANTLR start "declaration"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:48:1: declaration returns [Statement decl] : ^( DECL type ID ( EQUAL expr )? ) ;
    public final Statement declaration() throws RecognitionException {
        Statement decl = null;

        CommonTree ID2=null;
        TypeSymbol type1 = null;

        Expression expr3 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:52:3: ( ^( DECL type ID ( EQUAL expr )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:52:5: ^( DECL type ID ( EQUAL expr )? )
            {
            match(input,DECL,FOLLOW_DECL_in_declaration144); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_declaration146);
            type1=type();

            state._fsp--;

            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration148); 
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:52:20: ( EQUAL expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:52:21: EQUAL expr
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_declaration151); 
                    pushFollow(FOLLOW_expr_in_declaration153);
                    expr3=expr();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            decl = new Declaration(errtree, type1, (ID2!=null?ID2.getText():null), expr3);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return decl;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "statement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:55:1: statement returns [Statement stat] : ( assignment | printstatement | returnstatement | statcall | ifstatement | whilestatement | BREAK | CONTINUE );
    public final Statement statement() throws RecognitionException {
        Statement stat = null;

        Statement assignment4 = null;

        Statement printstatement5 = null;

        Statement returnstatement6 = null;

        Statement statcall7 = null;

        Statement ifstatement8 = null;

        Statement whilestatement9 = null;


        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:56:3: ( assignment | printstatement | returnstatement | statcall | ifstatement | whilestatement | BREAK | CONTINUE )
            int alt4=8;
            switch ( input.LA(1) ) {
            case EQUAL:
            case SET:
                {
                alt4=1;
                }
                break;
            case PRINT:
            case PRINTLN:
                {
                alt4=2;
                }
                break;
            case RETURN:
                {
                alt4=3;
                }
                break;
            case CALL:
                {
                alt4=4;
                }
                break;
            case IF:
                {
                alt4=5;
                }
                break;
            case WHILE:
                {
                alt4=6;
                }
                break;
            case BREAK:
                {
                alt4=7;
                }
                break;
            case CONTINUE:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:56:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement177);
                    assignment4=assignment();

                    state._fsp--;

                    stat = assignment4;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:57:5: printstatement
                    {
                    pushFollow(FOLLOW_printstatement_in_statement185);
                    printstatement5=printstatement();

                    state._fsp--;

                    stat = printstatement5;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:58:5: returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement193);
                    returnstatement6=returnstatement();

                    state._fsp--;

                    stat = returnstatement6;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:59:5: statcall
                    {
                    pushFollow(FOLLOW_statcall_in_statement201);
                    statcall7=statcall();

                    state._fsp--;

                    stat = statcall7;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:60:5: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement209);
                    ifstatement8=ifstatement();

                    state._fsp--;

                    stat = ifstatement8;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:61:5: whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement217);
                    whilestatement9=whilestatement();

                    state._fsp--;

                    stat = whilestatement9;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:62:5: BREAK
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement225); 
                    stat = new Break();

                    }
                    break;
                case 8 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:63:5: CONTINUE
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement233); 
                    stat = new Continue();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "statement"


    // $ANTLR start "whilestatement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:66:1: whilestatement returns [Statement stat] : ^( WHILE expr block ) ;
    public final Statement whilestatement() throws RecognitionException {
        Statement stat = null;

        Expression expr10 = null;

        Block block11 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:70:3: ( ^( WHILE expr block ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:70:5: ^( WHILE expr block )
            {
            match(input,WHILE,FOLLOW_WHILE_in_whilestatement260); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_whilestatement262);
            expr10=expr();

            state._fsp--;

            pushFollow(FOLLOW_block_in_whilestatement264);
            block11=block();

            state._fsp--;


            match(input, Token.UP, null); 
            stat = new WhileStatement(errtree, expr10, block11);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "whilestatement"


    // $ANTLR start "ifstatement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:73:1: ifstatement returns [Statement stat] : ^( IF expr b1= block ( ELSE b2= block )? ) ;
    public final Statement ifstatement() throws RecognitionException {
        Statement stat = null;

        Block b1 = null;

        Block b2 = null;

        Expression expr12 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:77:3: ( ^( IF expr b1= block ( ELSE b2= block )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:77:5: ^( IF expr b1= block ( ELSE b2= block )? )
            {
            match(input,IF,FOLLOW_IF_in_ifstatement292); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifstatement294);
            expr12=expr();

            state._fsp--;

            pushFollow(FOLLOW_block_in_ifstatement298);
            b1=block();

            state._fsp--;

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:77:24: ( ELSE b2= block )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ELSE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:77:25: ELSE b2= block
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifstatement301); 
                    pushFollow(FOLLOW_block_in_ifstatement305);
                    b2=block();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            stat = new IfStatement(errtree, expr12, b1, b2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "ifstatement"


    // $ANTLR start "returnstatement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:80:1: returnstatement returns [Statement stat] : ^( RETURN ( expr )? ) ;
    public final Statement returnstatement() throws RecognitionException {
        Statement stat = null;

        Expression expr13 = null;


        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:81:3: ( ^( RETURN ( expr )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:81:5: ^( RETURN ( expr )? )
            {
            match(input,RETURN,FOLLOW_RETURN_in_returnstatement330); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:81:14: ( expr )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=POS && LA6_0<=CALL)||(LA6_0>=CAST && LA6_0<=ID)||(LA6_0>=XOR && LA6_0<=STRING)) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:81:14: expr
                        {
                        pushFollow(FOLLOW_expr_in_returnstatement332);
                        expr13=expr();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            stat = new Return(expr13);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "returnstatement"


    // $ANTLR start "printstatement"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:84:1: printstatement returns [Statement pstat] : ( ^( PRINT expr ) | ^( PRINTLN expr ) );
    public final Statement printstatement() throws RecognitionException {
        Statement pstat = null;

        Expression expr14 = null;

        Expression expr15 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:88:3: ( ^( PRINT expr ) | ^( PRINTLN expr ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==PRINT) ) {
                alt7=1;
            }
            else if ( (LA7_0==PRINTLN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:88:5: ^( PRINT expr )
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_printstatement361); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_printstatement363);
                    expr14=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pstat = new Print(errtree, expr14);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:89:5: ^( PRINTLN expr )
                    {
                    match(input,PRINTLN,FOLLOW_PRINTLN_in_printstatement373); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_printstatement375);
                    expr15=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pstat = new PrintLn(errtree, expr15);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pstat;
    }
    // $ANTLR end "printstatement"


    // $ANTLR start "block"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:92:1: block returns [Block block] : ^( BLOCK (d= declaration )* (s= statement )* ) ;
    public final Block block() throws RecognitionException {
        Block block = null;

        Statement d = null;

        Statement s = null;



          ArrayList<Statement> decl = new ArrayList<Statement>();
          ArrayList<Statement> stats = new ArrayList<Statement>();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:100:3: ( ^( BLOCK (d= declaration )* (s= statement )* ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:100:5: ^( BLOCK (d= declaration )* (s= statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block408); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:100:13: (d= declaration )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==DECL) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:100:14: d= declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_block413);
                	    d=declaration();

                	    state._fsp--;

                	    decl.add(d);

                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);

                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:100:51: (s= statement )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==CALL||LA9_0==EQUAL||(LA9_0>=BREAK && LA9_0<=WHILE)||LA9_0==IF||(LA9_0>=RETURN && LA9_0<=PRINTLN)||LA9_0==SET) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:100:52: s= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block422);
                	    s=statement();

                	    state._fsp--;

                	    stats.add(s);

                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }


              block = new Block(decl, stats);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return block;
    }
    // $ANTLR end "block"


    // $ANTLR start "assignment"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:103:1: assignment returns [Statement assig] : ( ^( EQUAL ID expr ) | ^( SET ID expr ) );
    public final Statement assignment() throws RecognitionException {
        Statement assig = null;

        CommonTree ID16=null;
        CommonTree ID18=null;
        Expression expr17 = null;

        Expression expr19 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:107:3: ( ^( EQUAL ID expr ) | ^( SET ID expr ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EQUAL) ) {
                alt10=1;
            }
            else if ( (LA10_0==SET) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:107:5: ^( EQUAL ID expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_assignment452); 

                    match(input, Token.DOWN, null); 
                    ID16=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment454); 
                    pushFollow(FOLLOW_expr_in_assignment456);
                    expr17=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    assig = new Assignment(errtree, (ID16!=null?ID16.getText():null), expr17);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:108:5: ^( SET ID expr )
                    {
                    match(input,SET,FOLLOW_SET_in_assignment466); 

                    match(input, Token.DOWN, null); 
                    ID18=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment468); 
                    pushFollow(FOLLOW_expr_in_assignment470);
                    expr19=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    assig = new Set(errtree, (ID18!=null?ID18.getText():null), expr19);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return assig;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "function"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:111:1: function returns [Function function] : ^( FUNCTION ^( ID type ) ( params )? block ) ;
    public final Function function() throws RecognitionException {
        Function function = null;

        CommonTree ID21=null;
        Block block20 = null;

        TypeSymbol type22 = null;

        ArrayList<VariableSymbol> params23 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:115:3: ( ^( FUNCTION ^( ID type ) ( params )? block ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:115:5: ^( FUNCTION ^( ID type ) ( params )? block )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_function498); 

            match(input, Token.DOWN, null); 
            ID21=(CommonTree)match(input,ID,FOLLOW_ID_in_function501); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_function503);
            type22=type();

            state._fsp--;


            match(input, Token.UP, null); 
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:115:27: ( params )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==PARAMS) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:115:27: params
                    {
                    pushFollow(FOLLOW_params_in_function506);
                    params23=params();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_function509);
            block20=block();

            state._fsp--;


            match(input, Token.UP, null); 

                if (!block20.endsWithReturn())
                  block20.addVoidReturn();
                function = new Function((ID21!=null?ID21.getText():null), type22, params23, block20);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return function;
    }
    // $ANTLR end "function"


    // $ANTLR start "params"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:121:1: params returns [ArrayList<VariableSymbol> params] : ^( PARAMS (p= parameter )* ) ;
    public final ArrayList<VariableSymbol> params() throws RecognitionException {
        ArrayList<VariableSymbol> params = null;

        VariableSymbol p = null;


        ArrayList<VariableSymbol> paramlist = new ArrayList<VariableSymbol>();
        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:124:3: ( ^( PARAMS (p= parameter )* ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:124:5: ^( PARAMS (p= parameter )* )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_params539); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:124:14: (p= parameter )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ID) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:124:15: p= parameter
                	    {
                	    pushFollow(FOLLOW_parameter_in_params544);
                	    p=parameter();

                	    state._fsp--;

                	    paramlist.add(p);

                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

            params = paramlist;
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return params;
    }
    // $ANTLR end "params"


    // $ANTLR start "parameter"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:126:1: parameter returns [VariableSymbol vs] : ^( ID type ) ;
    public final VariableSymbol parameter() throws RecognitionException {
        VariableSymbol vs = null;

        CommonTree ID24=null;
        TypeSymbol type25 = null;


        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:127:3: ( ^( ID type ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:127:5: ^( ID type )
            {
            ID24=(CommonTree)match(input,ID,FOLLOW_ID_in_parameter566); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_parameter568);
            type25=type();

            state._fsp--;


            match(input, Token.UP, null); 
            vs = new VariableSymbol((ID24!=null?ID24.getText():null), type25);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return vs;
    }
    // $ANTLR end "parameter"


    // $ANTLR start "statcall"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:130:1: statcall returns [Statement stat] : ^( CALL ID (a= args )? ) ;
    public final Statement statcall() throws RecognitionException {
        Statement stat = null;

        CommonTree ID26=null;
        ArrayList<Expression> a = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:134:3: ( ^( CALL ID (a= args )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:134:5: ^( CALL ID (a= args )? )
            {
            match(input,CALL,FOLLOW_CALL_in_statcall596); 

            match(input, Token.DOWN, null); 
            ID26=(CommonTree)match(input,ID,FOLLOW_ID_in_statcall598); 
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:134:16: (a= args )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ARGS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:134:16: a= args
                    {
                    pushFollow(FOLLOW_args_in_statcall602);
                    a=args();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            stat = new StatCall(errtree, (ID26!=null?ID26.getText():null), a);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stat;
    }
    // $ANTLR end "statcall"


    // $ANTLR start "exprcall"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:137:1: exprcall returns [Expression expr] : ^( CALL ID (a= args )? ) ;
    public final Expression exprcall() throws RecognitionException {
        Expression expr = null;

        CommonTree ID27=null;
        ArrayList<Expression> a = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:141:3: ( ^( CALL ID (a= args )? ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:141:5: ^( CALL ID (a= args )? )
            {
            match(input,CALL,FOLLOW_CALL_in_exprcall630); 

            match(input, Token.DOWN, null); 
            ID27=(CommonTree)match(input,ID,FOLLOW_ID_in_exprcall632); 
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:141:16: (a= args )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ARGS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:141:16: a= args
                    {
                    pushFollow(FOLLOW_args_in_exprcall636);
                    a=args();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            expr = new Call(errtree, (ID27!=null?ID27.getText():null), a);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "exprcall"


    // $ANTLR start "args"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:143:1: args returns [ArrayList<Expression> args] : ^( ARGS (e= expr )* ) ;
    public final ArrayList<Expression> args() throws RecognitionException {
        ArrayList<Expression> args = null;

        Expression e = null;


        ArrayList<Expression> arguments = new ArrayList<Expression>();
        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:146:3: ( ^( ARGS (e= expr )* ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:146:5: ^( ARGS (e= expr )* )
            {
            match(input,ARGS,FOLLOW_ARGS_in_args667); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:146:12: (e= expr )*
                loop15:
                do {
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=POS && LA15_0<=CALL)||(LA15_0>=CAST && LA15_0<=ID)||(LA15_0>=XOR && LA15_0<=STRING)) ) {
                        alt15=1;
                    }


                    switch (alt15) {
                	case 1 :
                	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:146:13: e= expr
                	    {
                	    pushFollow(FOLLOW_expr_in_args672);
                	    e=expr();

                	    state._fsp--;

                	    arguments.add(e);

                	    }
                	    break;

                	default :
                	    break loop15;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

            args = arguments;
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return args;
    }
    // $ANTLR end "args"


    // $ANTLR start "expr"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:148:1: expr returns [Expression expression] : ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( CONCAT e1= expr e2= expr ) | ^( MULT e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( POW e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( OR e1= expr e2= expr ) | ^( XOR e1= expr e2= expr ) | ^( EQUIV e1= expr e2= expr ) | ^( NOTEQ e1= expr e2= expr ) | ^( GTHAN e1= expr e2= expr ) | ^( LTHAN e1= expr e2= expr ) | ^( GTHANE e1= expr e2= expr ) | ^( LTHANE e1= expr e2= expr ) | ^( POS e= expr ) | ^( NEG e= expr ) | ^( NOT e= expr ) | ^( KVPAIR e1= expr e2= expr ) | ^( GET e= expr ) | ^( CAST type e= expr ) | exprcall | NUMBER | FPNUMBER | TRUE | FALSE | STRING | ID );
    public final Expression expr() throws RecognitionException {
        Expression expression = null;

        CommonTree NUMBER30=null;
        CommonTree FPNUMBER31=null;
        CommonTree TRUE32=null;
        CommonTree FALSE33=null;
        CommonTree STRING34=null;
        CommonTree ID35=null;
        Expression e1 = null;

        Expression e2 = null;

        Expression e = null;

        TypeSymbol type28 = null;

        Expression exprcall29 = null;



          CommonTree errtree = getErrorHeader();

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:152:3: ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( CONCAT e1= expr e2= expr ) | ^( MULT e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( POW e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( OR e1= expr e2= expr ) | ^( XOR e1= expr e2= expr ) | ^( EQUIV e1= expr e2= expr ) | ^( NOTEQ e1= expr e2= expr ) | ^( GTHAN e1= expr e2= expr ) | ^( LTHAN e1= expr e2= expr ) | ^( GTHANE e1= expr e2= expr ) | ^( LTHANE e1= expr e2= expr ) | ^( POS e= expr ) | ^( NEG e= expr ) | ^( NOT e= expr ) | ^( KVPAIR e1= expr e2= expr ) | ^( GET e= expr ) | ^( CAST type e= expr ) | exprcall | NUMBER | FPNUMBER | TRUE | FALSE | STRING | ID )
            int alt16=28;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt16=1;
                }
                break;
            case MINUS:
                {
                alt16=2;
                }
                break;
            case CONCAT:
                {
                alt16=3;
                }
                break;
            case MULT:
                {
                alt16=4;
                }
                break;
            case DIV:
                {
                alt16=5;
                }
                break;
            case POW:
                {
                alt16=6;
                }
                break;
            case AND:
                {
                alt16=7;
                }
                break;
            case OR:
                {
                alt16=8;
                }
                break;
            case XOR:
                {
                alt16=9;
                }
                break;
            case EQUIV:
                {
                alt16=10;
                }
                break;
            case NOTEQ:
                {
                alt16=11;
                }
                break;
            case GTHAN:
                {
                alt16=12;
                }
                break;
            case LTHAN:
                {
                alt16=13;
                }
                break;
            case GTHANE:
                {
                alt16=14;
                }
                break;
            case LTHANE:
                {
                alt16=15;
                }
                break;
            case POS:
                {
                alt16=16;
                }
                break;
            case NEG:
                {
                alt16=17;
                }
                break;
            case NOT:
                {
                alt16=18;
                }
                break;
            case KVPAIR:
                {
                alt16=19;
                }
                break;
            case GET:
                {
                alt16=20;
                }
                break;
            case CAST:
                {
                alt16=21;
                }
                break;
            case CALL:
                {
                alt16=22;
                }
                break;
            case NUMBER:
                {
                alt16=23;
                }
                break;
            case FPNUMBER:
                {
                alt16=24;
                }
                break;
            case TRUE:
                {
                alt16=25;
                }
                break;
            case FALSE:
                {
                alt16=26;
                }
                break;
            case STRING:
                {
                alt16=27;
                }
                break;
            case ID:
                {
                alt16=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:152:5: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr700); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr704);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr708);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Add(errtree, e1, e2);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:153:5: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr718); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr722);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr726);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Subtract(errtree, e1, e2);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:154:5: ^( CONCAT e1= expr e2= expr )
                    {
                    match(input,CONCAT,FOLLOW_CONCAT_in_expr736); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr740);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr744);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Concat(errtree, e1, e2);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:155:5: ^( MULT e1= expr e2= expr )
                    {
                    match(input,MULT,FOLLOW_MULT_in_expr754); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr758);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr762);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Multiply(errtree, e1, e2);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:156:5: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr772); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr776);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr780);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Divide(errtree, e1, e2);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:157:5: ^( POW e1= expr e2= expr )
                    {
                    match(input,POW,FOLLOW_POW_in_expr790); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr794);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr798);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Power(errtree, e1, e2);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:158:5: ^( AND e1= expr e2= expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr808); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr812);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr816);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new And(errtree, e1, e2);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:159:5: ^( OR e1= expr e2= expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr826); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr830);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr834);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Or(errtree, e1, e2);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:160:5: ^( XOR e1= expr e2= expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr844); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr848);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr852);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Xor(errtree, e1, e2);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:161:5: ^( EQUIV e1= expr e2= expr )
                    {
                    match(input,EQUIV,FOLLOW_EQUIV_in_expr862); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr866);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr870);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Equal(errtree, e1, e2);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:162:5: ^( NOTEQ e1= expr e2= expr )
                    {
                    match(input,NOTEQ,FOLLOW_NOTEQ_in_expr880); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr884);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr888);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new NotEqual(errtree, e1, e2);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:163:5: ^( GTHAN e1= expr e2= expr )
                    {
                    match(input,GTHAN,FOLLOW_GTHAN_in_expr898); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr902);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr906);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Gthan(errtree, e1, e2);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:164:5: ^( LTHAN e1= expr e2= expr )
                    {
                    match(input,LTHAN,FOLLOW_LTHAN_in_expr916); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr920);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr924);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Lthan(errtree, e1, e2);

                    }
                    break;
                case 14 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:165:5: ^( GTHANE e1= expr e2= expr )
                    {
                    match(input,GTHANE,FOLLOW_GTHANE_in_expr934); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr938);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr942);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new GthanE(errtree, e1, e2);

                    }
                    break;
                case 15 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:166:5: ^( LTHANE e1= expr e2= expr )
                    {
                    match(input,LTHANE,FOLLOW_LTHANE_in_expr952); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr956);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr960);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new LthanE(errtree, e1, e2);

                    }
                    break;
                case 16 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:167:5: ^( POS e= expr )
                    {
                    match(input,POS,FOLLOW_POS_in_expr970); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr974);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Pos(errtree, e);

                    }
                    break;
                case 17 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:168:5: ^( NEG e= expr )
                    {
                    match(input,NEG,FOLLOW_NEG_in_expr984); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr988);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Neg(errtree, e);

                    }
                    break;
                case 18 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:169:5: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr998); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1002);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Not(errtree, e);

                    }
                    break;
                case 19 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:170:5: ^( KVPAIR e1= expr e2= expr )
                    {
                    match(input,KVPAIR,FOLLOW_KVPAIR_in_expr1012); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1016);
                    e1=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr1020);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new KVPair(errtree, e1, e2);

                    }
                    break;
                case 20 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:171:5: ^( GET e= expr )
                    {
                    match(input,GET,FOLLOW_GET_in_expr1030); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr1034);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Get(errtree, e);

                    }
                    break;
                case 21 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:172:5: ^( CAST type e= expr )
                    {
                    match(input,CAST,FOLLOW_CAST_in_expr1044); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_in_expr1046);
                    type28=type();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr1050);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    expression = new Cast(errtree, type28, e);

                    }
                    break;
                case 22 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:173:5: exprcall
                    {
                    pushFollow(FOLLOW_exprcall_in_expr1059);
                    exprcall29=exprcall();

                    state._fsp--;

                    expression = exprcall29;

                    }
                    break;
                case 23 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:174:5: NUMBER
                    {
                    NUMBER30=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expr1067); 
                    expression = new Atom(new VarValue((NUMBER30!=null?NUMBER30.getText():null)));

                    }
                    break;
                case 24 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:175:5: FPNUMBER
                    {
                    FPNUMBER31=(CommonTree)match(input,FPNUMBER,FOLLOW_FPNUMBER_in_expr1075); 
                    expression = new Atom(new VarValue((FPNUMBER31!=null?FPNUMBER31.getText():null)));

                    }
                    break;
                case 25 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:176:5: TRUE
                    {
                    TRUE32=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_expr1083); 
                    expression = new Atom(new VarValue((TRUE32!=null?TRUE32.getText():null)));

                    }
                    break;
                case 26 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:177:5: FALSE
                    {
                    FALSE33=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_expr1091); 
                    expression = new Atom(new VarValue((FALSE33!=null?FALSE33.getText():null)));

                    }
                    break;
                case 27 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:178:5: STRING
                    {
                    STRING34=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expr1099); 
                    expression = new Atom(new VarValue((STRING34!=null?STRING34.getText():null)));

                    }
                    break;
                case 28 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:179:5: ID
                    {
                    ID35=(CommonTree)match(input,ID,FOLLOW_ID_in_expr1107); 
                    expression = new Identifier(errtree, (ID35!=null?ID35.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expression;
    }
    // $ANTLR end "expr"


    // $ANTLR start "type"
    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:182:1: type returns [TypeSymbol type] : ( VAR | KEY | OBJECT | ARRAY | VOID );
    public final TypeSymbol type() throws RecognitionException {
        TypeSymbol type = null;

        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:183:3: ( VAR | KEY | OBJECT | ARRAY | VOID )
            int alt17=5;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt17=1;
                }
                break;
            case KEY:
                {
                alt17=2;
                }
                break;
            case OBJECT:
                {
                alt17=3;
                }
                break;
            case ARRAY:
                {
                alt17=4;
                }
                break;
            case VOID:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:183:5: VAR
                    {
                    match(input,VAR,FOLLOW_VAR_in_type1126); 
                    type = symtab.resolveType("var");

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:184:5: KEY
                    {
                    match(input,KEY,FOLLOW_KEY_in_type1134); 
                    type = symtab.resolveType("key");

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:185:5: OBJECT
                    {
                    match(input,OBJECT,FOLLOW_OBJECT_in_type1142); 
                    type = symtab.resolveType("object");

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:186:5: ARRAY
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_type1150); 
                    type = symtab.resolveType("array");

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\BuildITree.g:187:5: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_type1158); 
                    type = symtab.resolveType("void");

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_program68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_globals_in_program72 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_declaration_in_globals105 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_function_in_globals114 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_DECL_in_declaration144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_declaration146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_declaration148 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_EQUAL_in_declaration151 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_declaration153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstatement_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statcall_in_statement201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whilestatement260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whilestatement262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_whilestatement264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifstatement292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifstatement294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_ifstatement298 = new BitSet(new long[]{0x0000000000800008L});
    public static final BitSet FOLLOW_ELSE_in_ifstatement301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_ifstatement305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_returnstatement330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_returnstatement332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_printstatement361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printstatement363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINTLN_in_printstatement373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printstatement375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_block413 = new BitSet(new long[]{0x00000000274E88A8L});
    public static final BitSet FOLLOW_statement_in_block422 = new BitSet(new long[]{0x00000000274E8808L});
    public static final BitSet FOLLOW_EQUAL_in_assignment452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment454 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_assignment456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_assignment466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment468 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_assignment470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_function498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_function503 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_params_in_function506 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_function509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMS_in_params539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_params544 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_ID_in_parameter566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_parameter568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_statcall596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_statcall598 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_args_in_statcall602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_exprcall630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_exprcall632 = new BitSet(new long[]{0x0000000000001008L});
    public static final BitSet FOLLOW_args_in_exprcall636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGS_in_args667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_args672 = new BitSet(new long[]{0x003FFFFF80006E08L});
    public static final BitSet FOLLOW_PLUS_in_expr700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr704 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr722 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_expr736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr740 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MULT_in_expr754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr758 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr776 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POW_in_expr790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr794 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr812 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr816 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr830 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr848 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr852 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUIV_in_expr862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr866 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOTEQ_in_expr880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr884 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTHAN_in_expr898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr902 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTHAN_in_expr916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr920 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr924 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTHANE_in_expr934 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr938 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr942 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTHANE_in_expr952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr956 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POS_in_expr970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr974 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEG_in_expr984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr998 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_KVPAIR_in_expr1012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1016 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr1020 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GET_in_expr1030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1034 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expr1044 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr1046 = new BitSet(new long[]{0x003FFFFF80006E00L});
    public static final BitSet FOLLOW_expr_in_expr1050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_exprcall_in_expr1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FPNUMBER_in_expr1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_expr1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_expr1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_type1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_type1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_in_type1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_type1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_type1158 = new BitSet(new long[]{0x0000000000000002L});

}