package Utils;

/**
 * Created by arisimam on 3/24/15.
 */
public class constants {

    public enum TRXSPC
    {
        SPACE,
        TXNCFG,
        REQUEST,
        TXNNAME,
        SOURCE,
        TIMESTAMP,
        TXNMGR,
        READONLY,
        RESPONSE,
        ERRORSTEP,
        ERRORSTATUS,
        TMS_OBJ,
        DATA_LIB,
        FLASH_TRX,
        DEBUG_FLASH,
        TRACE_HEAD,
        FLASHIZJSON,
        RESTAPI_TXN_QUEUE,
        TIMEOUT,
        CONFIGMOTHER,
        DBCONN,
        HTTPCONN,
        SAVE_LOG,
        CLASS_NAME,
        EERR_DESCR,
        IS_TIMEOUT_SIM,
        USER_PAN,


    };


    public  static final int INSERTDB=1;
    public  static final int SELECTDB=2;
    public  static final int UPDATEDB=3;
    public  static final int DELETEDB=4;


    public static final String SEPARATORURL = "&";//%SEPARATOR%
    public static final String PINCODEFLASHIZ= "1234";//%PINCODE%

    public static final byte  FLASHIZ_CHECK_PAY=(byte)0xA1;
   public static final byte  FLASHIZ_CREA_INVOICE=(byte)0xA7;
    public static final byte  FLASHIZ_INIT_TERMINAL=(byte)0xA2;


    public final static String RC_SUCCESS 				= "00";
    public final static String RC_SYSTEM_ERROR 			= "05";
    public final static String RC_CMS_GENERAL_FAILURE 	= "06";
    public final static String RC_INVALID_TRANS_REQUEST = "12";
    public final static String RC_INVALID_INVO_NOTFOUND 	= "13";
    public final static String RC_INVALID_KEY_MERCHANT 	= "14";
    public final static String RC_DUPLICATE_RRN 		= "19";
    public final static String RC_BANK_UNSUPPORTED 		= "24";
    public final static String RC_INVALID_DEST_ACCOUNT 	= "25";
    public final static String RC_UNKNOWN_MESSAGE_FORMAT 	= "30";
    public final static String RC_UNSUPPORTED_FUNC 		= "40";
    public final static String RC_CANCELLED_TRANS 		= "41";

    public final static String RC_INSUFFICIENT_FUNDS 	= "51";
    public final static String RC_NO_CHECKING_ACCOUNT 	= "52";
    public final static String RC_NO_SAVING_ACCOUNT 	= "53";
    public final static String RC_CARD_HAS_EXPIRED 		= "54";
    public final static String RC_CARD_IS_BLOCKED 		= "56";
    public final static String RC_SUSPICIOUS_CARD 		= "57";
    public final static String RC_TRANS_NOT_PERMITTED 	= "58";
    public final static String RC_TRANS_NOT_FOUND    	= "59";
    public final static String RC_RESTRICTED_CARD 		= "62";
    public final static String RC_SECURITY_VIOLATION 	= "63";
    public final static String RC_RESPONSE_TO_LATE 		= "68";
    public final static String RC_LINK_UNAVAILABLE 		= "89";
    public final static String RC_DEST_PROC_UNAVAILABLE = "91";
    public final static String RC_DUP_TRANSMISSION 		= "94";




    public static final String ISTIMEOUT="server.istimeout";

    public static final String PRN_IDR ="IDR :";
    public static final String PRN_IDR_PLUS ="(+)IDR :";
    public static final String PRN_IDR_MIN ="(-)IDR :";


    public static final String PRN_IVC     ="INV.ID    :";

    public static final String PRN_TRANS   ="Transaction";
    public static final String PRN_APPROVE ="Approved";
    public static final String PRN_AMT     ="Amount    :";
    public static final String PRN_TIP     ="TIP       :";
    public static final String PRN_TOT     ="TOTAL     :";
    public static final String PRN_DISC    ="DISCOUNT  :";
    public static final String PRN_INVJUST ="INV. ID   :";
    public static final String PRN_COUP    ="COUPON    :";
    public static final String PRN_NOTRANS ="No. Trans :";
    public static final String PRN_ISSUER  ="Issuer    :";
    public static final String PRN_NOREF   ="No. Ref   :";




    public static final String PRN_FOOTNOTE1 ="SILAKAN DI SCAN DENGAN";
    public static final String PRN_FOOTNOTE2 ="APLIKASI SMARTPHONE ANDA";
    public static final String PRN_FOOTNOTE3 ="INI BUKAN BUKTI PEMBAYARAN";
    public static final String PRN_FOOTNOTE4 ="TIDAK PERLU DI TANDATANGAN";

    public static final String PRN_FOOTNOTE5 ="TRANSAKSI INI TIDAK MEMBUTUHKAN";
    public static final String PRN_FOOTNOTE6 ="TANDATANGAN";
    public static final String PRN_FOOTNOTE7 ="*** Service by Dimo ***";

    public static final byte FRM_NORMAL=(byte)0xA0;
    public static final byte FRM_DBLH=(byte)0xB0;
    public static final byte FRM_DBLW=(byte)0xC0;
    public static final byte FRM_QR=(byte)0xD0;

    public static final byte FRM_LEFT=(byte)0x01;
    public static final byte FRM_RIGTH=(byte)0x03;
    public static final byte FRM_CENTER=(byte)0x02;
    public static final byte FRM_JUSTIF=(byte)0x04;

    public static final byte FRM_SEP=(byte)0x02;
    public static final byte FRM_END=(byte)0x03;


    /// web
    public static final String FAVICON="favicon.ico";
    public static final String  IPREMOTE="ipRemote";
    public static final String  PORTREMOTE="portRemote";
    public static final String  WEBFILE="fileCfg";
    public static final String CLASSFILE="classCfg";
    public static final String WEBSEPARATOR  ="/";

    // EDC printing
    public static final byte PRNT_FORMAT_NORM =(byte)0x01;
    public static final byte PRNT_FORMAT_DISC =(byte)0x02;
    public static final byte PRNT_FORMAT_COUP  =(byte)0x03;

    public static final byte PRNT_FORMAT_DISC_TIP =(byte)0x04;
    public static final byte PRNT_FORMAT_COUP_TIP =(byte)0x05;
    public static final byte PRNT_FORMAT_NORM_TIP =(byte)0x06;

    public static final byte PRNT_FORMAT_NORM_POINT =(byte)0x07;
    public static final byte PRNT_FORMAT_DISC_POINT =(byte)0x08;
    public static final byte PRNT_FORMAT_COUP_POINT =(byte)0x09;

    public static final byte PRNT_FORMAT_DISC_TIP_POINT =(byte)0x10;
    public static final byte PRNT_FORMAT_COUP_TIP_POINT =(byte)0x11;
    public static final byte PRNT_FORMAT_NORM_TIP_POINT  =(byte)0x12;

   // end edc printing

    public static final String PRINT_IS_BRAND_NAME_SUPPORT="000040";


    // JSON

    public  final static String TYPE_JSON_REQUEST_API="requestApikey";
    public  final static String TYPE_JSON_REQUEST_INQ="requestInquiry";
    public  final static String TYPE_JSON_REQUEST_PAY="requestPayment";
    public  final static String TYPE_JSON_REQUEST_ADV="requestAdvice";
    public  final static String TYPE_JSON_REQUEST_CAN="requestCancel";

    public final static String ERROR_MD_API_OK="MD_API_OK_00";
    public final static String ERROR_MD_API_GENERAL="ERROR_MD_API_GENERAL_01";
    public final static String ERROR_MD_API_FAILED_STR_TO_JSON="ERROR_MD_API_FAILED_STR_TO_JSON_02";
    public final static String ERROR_MD_API_FAILED_JSON_TO_MODEL="ERROR_MD_API_FAILED_JSON_TO_MODEL_03";
    public final static String ERROR_MD_API_FAILED_MODEL_TO_ISO="ERROR_MD_API_FAILED_MODEL_TO_ISO_04";
    public final static String ERROR_MD_API_FAILED_TO_CONNECT_MD="ERROR_MD_API_FAILED_TO_CONNECT_MD_05";
    public final static String ERROR_MD_API_FAILED_TO_CREATE_CHANNEL="ERROR_MD_API_FAILED_TO_CREATE_CHANNEL_06";
    public final static String ERROR_MD_API_FAILED_TO_RECEIVE_ISO="ERROR_MD_API_FAILED_TO_RECEIVE_ISO_07";
    public final static String ERROR_MD_API_FAILED_TO_OPEN_CONFIG="ERROR_MD_API_FAILED_TO_OPEN_CONFIG_08";
    public final static String ERROR_MD_API_FAILED_TO_CONVERT_JSON="ERROR_MD_API_FAILED_TO_CONVERT_JSON_09";
    public final static String ERROR_MD_API_RESPOND_DE="ERROR_MD_API_RESPOND_DE";


    public final static String STATUS_SUCCESS="success";
    public final static String STATUS_NOK="NOK";
    public final static String STATUS_SUCCESS_WITH_MESSAGE="PLEASE RENEW TOKEN";



    public final static String AUTHOZ ="AUTHOZ";
    public final static String AUTHREQ ="AUTHREQ";
    public final static String TOKENREQ="TOKENREQ";

    public final static String USER_DIMO="Dimo";
    public final static String PASS_DIMO="DimoMantapSepanjangMasa";

    public final static long TOKEN_EXPIRED=100;// 86400;


    public final  static String   PE_AVAILABLE_FOR_PAYMENT = "AVAILABLE_FOR_PAYMENT";
    public final  static String   PE_PAID="PAID"    ;                          //paid but we don't know if it's checked
    public final  static String   PE_PAIDANDCHECKED="PAID_AND_CHECKED";           //paid and we know it's been checked
    public final  static String   PE_OUTDATED="OUTDATED";
    public final  static String   PE_CANCELLED= "CANCELLED";                //cancelled by merchant
    public final  static String   PE_UNLIMITED_VALID_FOR= "UNLIMITED_VALID_FOR";
    public final  static String   PE_MULTIPLE_VALID_FOR= "MULTIPLE_VALID_FOR";
    public final  static String   PE_UNDEFINED ="UNDEFINED";
    public final  static String   PE_PENDING ="PENDING";
    public final  static String   PE_NOK ="NOK";
    public final  static String   PE_OK ="success";

    public static final String API_KEY = "API KEY ";
    public static final String SIGN_ON = "SIGN ON ";
    public static final String SIGN_OFF = "SIGN OFF";
    public static final String ECHO_TEST = "ECHO    ";























}
