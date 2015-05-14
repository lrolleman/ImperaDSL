// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g 2015-05-14 11:21:21

package ImperaSDLParser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ImperaLexer extends Lexer {
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

    public ImperaLexer() {;} 
    public ImperaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ImperaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g"; }

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:160:19: ( '/*' ( . )* '*/' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:160:21: '/*' ( . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:160:26: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:160:26: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:161:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:161:11: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:161:16: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n'||LA2_0=='\r') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:161:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:162:7: ( '{' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:162:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:163:7: ( '}' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:163:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:164:3: ( '(' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:164:5: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:165:3: ( ')' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:165:5: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RP"

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:166:3: ( '[' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:166:5: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LB"

    // $ANTLR start "RB"
    public final void mRB() throws RecognitionException {
        try {
            int _type = RB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:167:3: ( ']' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:167:5: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RB"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:168:4: ( '.' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:168:6: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:169:6: ( ',' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:169:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:170:6: ( '\"' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:170:8: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "SC"
    public final void mSC() throws RecognitionException {
        try {
            int _type = SC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:171:3: ( ';' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:171:5: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SC"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:172:5: ( 'true' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:172:7: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:173:6: ( 'false' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:173:8: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:174:5: ( 'null' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:174:7: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "US"
    public final void mUS() throws RecognitionException {
        try {
            int _type = US;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:175:3: ( '_' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:175:5: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "US"

    // $ANTLR start "BSLASH"
    public final void mBSLASH() throws RecognitionException {
        try {
            int _type = BSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:176:7: ( '\\\\' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:176:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BSLASH"

    // $ANTLR start "PRINTLN"
    public final void mPRINTLN() throws RecognitionException {
        try {
            int _type = PRINTLN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:177:8: ( 'println' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:177:10: 'println'
            {
            match("println"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINTLN"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:178:6: ( 'print' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:178:8: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:179:7: ( 'return' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:179:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:180:3: ( 'if' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:180:5: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:181:5: ( 'else' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:181:7: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:182:6: ( 'while' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:182:8: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:183:6: ( 'break' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:183:8: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:184:9: ( 'continue' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:184:11: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:185:3: ( 'as' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:185:5: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:187:4: ( 'var' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:187:6: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:188:4: ( 'key' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:188:6: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "OBJECT"
    public final void mOBJECT() throws RecognitionException {
        try {
            int _type = OBJECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:189:7: ( 'object' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:189:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:190:6: ( 'array' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:190:8: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:191:5: ( 'void' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:191:7: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:193:4: ( ':=' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:193:6: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:194:4: ( '%' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:194:6: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:195:7: ( '<-' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:195:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "EQUIV"
    public final void mEQUIV() throws RecognitionException {
        try {
            int _type = EQUIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:196:6: ( '==' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:196:8: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUIV"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:197:6: ( '=' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:197:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LTHAN"
    public final void mLTHAN() throws RecognitionException {
        try {
            int _type = LTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:198:6: ( '<' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:198:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTHAN"

    // $ANTLR start "GTHAN"
    public final void mGTHAN() throws RecognitionException {
        try {
            int _type = GTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:199:6: ( '>' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:199:8: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTHAN"

    // $ANTLR start "LTHANE"
    public final void mLTHANE() throws RecognitionException {
        try {
            int _type = LTHANE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:200:7: ( '<=' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:200:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTHANE"

    // $ANTLR start "GTHANE"
    public final void mGTHANE() throws RecognitionException {
        try {
            int _type = GTHANE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:201:7: ( '>=' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:201:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTHANE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:202:4: ( '!' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:202:6: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOTEQ"
    public final void mNOTEQ() throws RecognitionException {
        try {
            int _type = NOTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:203:6: ( '!=' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:203:8: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQ"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:204:5: ( '+' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:204:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:205:6: ( '-' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:205:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:206:5: ( '*' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:206:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:207:4: ( '/' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:207:6: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "PRED"
    public final void mPRED() throws RecognitionException {
        try {
            int _type = PRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:208:5: ( '|' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:208:7: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRED"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:209:3: ( 'or' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:209:5: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:210:4: ( 'xor' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:210:6: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:211:4: ( 'and' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:211:6: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "POW"
    public final void mPOW() throws RecognitionException {
        try {
            int _type = POW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:212:4: ( '^' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:212:6: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POW"

    // $ANTLR start "KVPAIR"
    public final void mKVPAIR() throws RecognitionException {
        try {
            int _type = KVPAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:213:7: ( ':' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:213:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KVPAIR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:216:3: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:216:5: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:222:15: ( '0' .. '9' )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:222:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:224:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | DIGIT )* )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:224:5: ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:224:33: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | DIGIT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:226:7: ( ( DIGIT )+ )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:226:9: ( DIGIT )+
            {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:226:9: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:226:9: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "FPNUMBER"
    public final void mFPNUMBER() throws RecognitionException {
        try {
            int _type = FPNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:227:9: ( ( DIGIT )+ DOT ( DIGIT )+ )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:227:11: ( DIGIT )+ DOT ( DIGIT )+
            {
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:227:11: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:227:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            mDOT(); 
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:227:22: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:227:22: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FPNUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:228:7: ( QUOTE ( . )* QUOTE )
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:228:9: QUOTE ( . )* QUOTE
            {
            mQUOTE(); 
            // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:228:15: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\"') ) {
                    alt7=2;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:228:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            mQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:8: ( MULTILINE_COMMENT | COMMENT | LBRACE | RBRACE | LP | RP | LB | RB | DOT | COMMA | QUOTE | SC | TRUE | FALSE | NULL | US | BSLASH | PRINTLN | PRINT | RETURN | IF | ELSE | WHILE | BREAK | CONTINUE | AS | VAR | KEY | OBJECT | ARRAY | VOID | SET | GET | CONCAT | EQUIV | EQUAL | LTHAN | GTHAN | LTHANE | GTHANE | NOT | NOTEQ | PLUS | MINUS | MULT | DIV | PRED | OR | XOR | AND | POW | KVPAIR | WS | ID | NUMBER | FPNUMBER | STRING )
        int alt8=57;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:10: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 

                }
                break;
            case 2 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:28: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 3 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:36: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 4 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:43: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 5 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:50: LP
                {
                mLP(); 

                }
                break;
            case 6 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:53: RP
                {
                mRP(); 

                }
                break;
            case 7 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:56: LB
                {
                mLB(); 

                }
                break;
            case 8 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:59: RB
                {
                mRB(); 

                }
                break;
            case 9 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:62: DOT
                {
                mDOT(); 

                }
                break;
            case 10 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:66: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 11 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:72: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 12 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:78: SC
                {
                mSC(); 

                }
                break;
            case 13 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:81: TRUE
                {
                mTRUE(); 

                }
                break;
            case 14 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:86: FALSE
                {
                mFALSE(); 

                }
                break;
            case 15 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:92: NULL
                {
                mNULL(); 

                }
                break;
            case 16 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:97: US
                {
                mUS(); 

                }
                break;
            case 17 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:100: BSLASH
                {
                mBSLASH(); 

                }
                break;
            case 18 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:107: PRINTLN
                {
                mPRINTLN(); 

                }
                break;
            case 19 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:115: PRINT
                {
                mPRINT(); 

                }
                break;
            case 20 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:121: RETURN
                {
                mRETURN(); 

                }
                break;
            case 21 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:128: IF
                {
                mIF(); 

                }
                break;
            case 22 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:131: ELSE
                {
                mELSE(); 

                }
                break;
            case 23 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:136: WHILE
                {
                mWHILE(); 

                }
                break;
            case 24 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:142: BREAK
                {
                mBREAK(); 

                }
                break;
            case 25 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:148: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 26 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:157: AS
                {
                mAS(); 

                }
                break;
            case 27 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:160: VAR
                {
                mVAR(); 

                }
                break;
            case 28 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:164: KEY
                {
                mKEY(); 

                }
                break;
            case 29 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:168: OBJECT
                {
                mOBJECT(); 

                }
                break;
            case 30 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:175: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 31 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:181: VOID
                {
                mVOID(); 

                }
                break;
            case 32 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:186: SET
                {
                mSET(); 

                }
                break;
            case 33 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:190: GET
                {
                mGET(); 

                }
                break;
            case 34 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:194: CONCAT
                {
                mCONCAT(); 

                }
                break;
            case 35 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:201: EQUIV
                {
                mEQUIV(); 

                }
                break;
            case 36 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:207: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 37 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:213: LTHAN
                {
                mLTHAN(); 

                }
                break;
            case 38 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:219: GTHAN
                {
                mGTHAN(); 

                }
                break;
            case 39 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:225: LTHANE
                {
                mLTHANE(); 

                }
                break;
            case 40 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:232: GTHANE
                {
                mGTHANE(); 

                }
                break;
            case 41 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:239: NOT
                {
                mNOT(); 

                }
                break;
            case 42 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:243: NOTEQ
                {
                mNOTEQ(); 

                }
                break;
            case 43 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:249: PLUS
                {
                mPLUS(); 

                }
                break;
            case 44 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:254: MINUS
                {
                mMINUS(); 

                }
                break;
            case 45 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:260: MULT
                {
                mMULT(); 

                }
                break;
            case 46 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:265: DIV
                {
                mDIV(); 

                }
                break;
            case 47 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:269: PRED
                {
                mPRED(); 

                }
                break;
            case 48 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:274: OR
                {
                mOR(); 

                }
                break;
            case 49 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:277: XOR
                {
                mXOR(); 

                }
                break;
            case 50 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:281: AND
                {
                mAND(); 

                }
                break;
            case 51 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:285: POW
                {
                mPOW(); 

                }
                break;
            case 52 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:289: KVPAIR
                {
                mKVPAIR(); 

                }
                break;
            case 53 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:296: WS
                {
                mWS(); 

                }
                break;
            case 54 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:299: ID
                {
                mID(); 

                }
                break;
            case 55 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:302: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 56 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:309: FPNUMBER
                {
                mFPNUMBER(); 

                }
                break;
            case 57 :
                // C:\\Users\\Lyle\\workspace\\ImperaDSL\\src\\ImperaSDLParser\\Impera.g:1:318: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\55\10\uffff\1\56\1\uffff\3\51\1\63\1\uffff\13\51\1\104"+
        "\1\uffff\1\107\1\111\1\113\1\115\4\uffff\1\51\3\uffff\1\117\5\uffff"+
        "\3\51\1\uffff\2\51\1\126\4\51\1\133\6\51\1\142\13\uffff\1\51\2\uffff"+
        "\5\51\1\uffff\4\51\1\uffff\1\51\1\156\1\157\1\51\1\161\1\51\1\uffff"+
        "\1\163\1\164\1\51\1\166\2\51\1\171\4\51\2\uffff\1\176\1\uffff\1"+
        "\51\2\uffff\1\u0080\1\uffff\1\u0082\1\51\1\uffff\1\u0084\1\u0085"+
        "\1\51\1\u0087\1\uffff\1\51\1\uffff\1\51\1\uffff\1\u008a\2\uffff"+
        "\1\51\1\uffff\1\u008c\1\u008d\1\uffff\1\51\2\uffff\1\u008f\1\uffff";
    static final String DFA8_eofS =
        "\u0090\uffff";
    static final String DFA8_minS =
        "\1\11\1\52\10\uffff\1\0\1\uffff\1\162\1\141\1\165\1\60\1\uffff"+
        "\1\162\1\145\1\146\1\154\1\150\1\162\1\157\1\156\1\141\1\145\1\142"+
        "\1\75\1\uffff\1\55\3\75\4\uffff\1\157\3\uffff\1\56\5\uffff\1\165"+
        "\2\154\1\uffff\1\151\1\164\1\60\1\163\1\151\1\145\1\156\1\60\1\162"+
        "\1\144\1\162\1\151\1\171\1\152\1\60\13\uffff\1\162\2\uffff\1\145"+
        "\1\163\1\154\1\156\1\165\1\uffff\1\145\1\154\1\141\1\164\1\uffff"+
        "\1\141\2\60\1\144\1\60\1\145\1\uffff\2\60\1\145\1\60\1\164\1\162"+
        "\1\60\1\145\1\153\1\151\1\171\2\uffff\1\60\1\uffff\1\143\2\uffff"+
        "\1\60\1\uffff\1\60\1\156\1\uffff\2\60\1\156\1\60\1\uffff\1\164\1"+
        "\uffff\1\156\1\uffff\1\60\2\uffff\1\165\1\uffff\2\60\1\uffff\1\145"+
        "\2\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\175\1\57\10\uffff\1\uffff\1\uffff\1\162\1\141\1\165\1\172\1"+
        "\uffff\1\162\1\145\1\146\1\154\1\150\1\162\1\157\1\163\1\157\1\145"+
        "\1\162\1\75\1\uffff\4\75\4\uffff\1\157\3\uffff\1\71\5\uffff\1\165"+
        "\2\154\1\uffff\1\151\1\164\1\172\1\163\1\151\1\145\1\156\1\172\1"+
        "\162\1\144\1\162\1\151\1\171\1\152\1\172\13\uffff\1\162\2\uffff"+
        "\1\145\1\163\1\154\1\156\1\165\1\uffff\1\145\1\154\1\141\1\164\1"+
        "\uffff\1\141\2\172\1\144\1\172\1\145\1\uffff\2\172\1\145\1\172\1"+
        "\164\1\162\1\172\1\145\1\153\1\151\1\171\2\uffff\1\172\1\uffff\1"+
        "\143\2\uffff\1\172\1\uffff\1\172\1\156\1\uffff\2\172\1\156\1\172"+
        "\1\uffff\1\164\1\uffff\1\156\1\uffff\1\172\2\uffff\1\165\1\uffff"+
        "\2\172\1\uffff\1\145\2\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\4\uffff"+
        "\1\21\14\uffff\1\41\4\uffff\1\53\1\54\1\55\1\57\1\uffff\1\63\1\65"+
        "\1\66\1\uffff\1\1\1\2\1\56\1\13\1\71\3\uffff\1\20\17\uffff\1\40"+
        "\1\64\1\42\1\47\1\45\1\43\1\44\1\50\1\46\1\52\1\51\1\uffff\1\67"+
        "\1\70\5\uffff\1\25\4\uffff\1\32\6\uffff\1\60\13\uffff\1\62\1\33"+
        "\1\uffff\1\34\1\uffff\1\61\1\15\1\uffff\1\17\2\uffff\1\26\4\uffff"+
        "\1\37\1\uffff\1\16\1\uffff\1\23\1\uffff\1\27\1\30\1\uffff\1\36\2"+
        "\uffff\1\24\1\uffff\1\35\1\22\1\uffff\1\31";
    static final String DFA8_specialS =
        "\12\uffff\1\0\u0085\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\41\1\12\2\uffff\1\35\2\uffff"+
            "\1\4\1\5\1\44\1\42\1\11\1\43\1\10\1\1\12\52\1\34\1\13\1\36\1"+
            "\37\1\40\2\uffff\32\51\1\6\1\20\1\7\1\47\1\17\1\uffff\1\30\1"+
            "\26\1\27\1\51\1\24\1\15\2\51\1\23\1\51\1\32\2\51\1\16\1\33\1"+
            "\21\1\51\1\22\1\51\1\14\1\51\1\31\1\25\1\46\2\51\1\2\1\45\1"+
            "\3",
            "\1\53\4\uffff\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\75\3\uffff\1\74\1\73",
            "\1\76\15\uffff\1\77",
            "\1\100",
            "\1\101\17\uffff\1\102",
            "\1\103",
            "",
            "\1\105\17\uffff\1\106",
            "\1\110",
            "\1\112",
            "\1\114",
            "",
            "",
            "",
            "",
            "\1\116",
            "",
            "",
            "",
            "\1\120\1\uffff\12\52",
            "",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\160",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\162",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\165",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\167",
            "\1\170",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\177",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\13\51\1\u0081\16"+
            "\51",
            "\1\u0083",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0086",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u008b",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u008e",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( MULTILINE_COMMENT | COMMENT | LBRACE | RBRACE | LP | RP | LB | RB | DOT | COMMA | QUOTE | SC | TRUE | FALSE | NULL | US | BSLASH | PRINTLN | PRINT | RETURN | IF | ELSE | WHILE | BREAK | CONTINUE | AS | VAR | KEY | OBJECT | ARRAY | VOID | SET | GET | CONCAT | EQUIV | EQUAL | LTHAN | GTHAN | LTHANE | GTHANE | NOT | NOTEQ | PLUS | MINUS | MULT | DIV | PRED | OR | XOR | AND | POW | KVPAIR | WS | ID | NUMBER | FPNUMBER | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_10 = input.LA(1);

                        s = -1;
                        if ( ((LA8_10>='\u0000' && LA8_10<='\uFFFF')) ) {s = 47;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}