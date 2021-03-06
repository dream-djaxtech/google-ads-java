// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/criterion_error.proto

package com.google.ads.googleads.v3.errors;

public final class CriterionErrorProto {
  private CriterionErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_errors_CriterionErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_errors_CriterionErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v3/errors/criteri" +
      "on_error.proto\022\036google.ads.googleads.v3." +
      "errors\032\034google/api/annotations.proto\"\342\037\n" +
      "\022CriterionErrorEnum\"\313\037\n\016CriterionError\022\017" +
      "\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\032\n\026CONCRETE" +
      "_TYPE_REQUIRED\020\002\022\035\n\031INVALID_EXCLUDED_CAT" +
      "EGORY\020\003\022\030\n\024INVALID_KEYWORD_TEXT\020\004\022\031\n\025KEY" +
      "WORD_TEXT_TOO_LONG\020\005\022\036\n\032KEYWORD_HAS_TOO_" +
      "MANY_WORDS\020\006\022\035\n\031KEYWORD_HAS_INVALID_CHAR" +
      "S\020\007\022\031\n\025INVALID_PLACEMENT_URL\020\010\022\025\n\021INVALI" +
      "D_USER_LIST\020\t\022\031\n\025INVALID_USER_INTEREST\020\n" +
      "\022$\n INVALID_FORMAT_FOR_PLACEMENT_URL\020\013\022\035" +
      "\n\031PLACEMENT_URL_IS_TOO_LONG\020\014\022\"\n\036PLACEME" +
      "NT_URL_HAS_ILLEGAL_CHAR\020\r\022,\n(PLACEMENT_U" +
      "RL_HAS_MULTIPLE_SITES_IN_LINE\020\016\0229\n5PLACE" +
      "MENT_IS_NOT_AVAILABLE_FOR_TARGETING_OR_E" +
      "XCLUSION\020\017\022\026\n\022INVALID_TOPIC_PATH\020\020\022\036\n\032IN" +
      "VALID_YOUTUBE_CHANNEL_ID\020\021\022\034\n\030INVALID_YO" +
      "UTUBE_VIDEO_ID\020\022\022\'\n#YOUTUBE_VERTICAL_CHA" +
      "NNEL_DEPRECATED\020\023\022*\n&YOUTUBE_DEMOGRAPHIC" +
      "_CHANNEL_DEPRECATED\020\024\022\033\n\027YOUTUBE_URL_UNS" +
      "UPPORTED\020\025\022 \n\034CANNOT_EXCLUDE_CRITERIA_TY" +
      "PE\020\026\022\034\n\030CANNOT_ADD_CRITERIA_TYPE\020\027\022\032\n\026IN" +
      "VALID_PRODUCT_FILTER\020\030\022\033\n\027PRODUCT_FILTER" +
      "_TOO_LONG\020\031\022$\n CANNOT_EXCLUDE_SIMILAR_US" +
      "ER_LIST\020\032\022\037\n\033CANNOT_ADD_CLOSED_USER_LIST" +
      "\020\033\022:\n6CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_S" +
      "EARCH_ONLY_CAMPAIGNS\020\034\0225\n1CANNOT_ADD_DIS" +
      "PLAY_ONLY_LISTS_TO_SEARCH_CAMPAIGNS\020\035\0227\n" +
      "3CANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SHOPPI" +
      "NG_CAMPAIGNS\020\036\0221\n-CANNOT_ADD_USER_INTERE" +
      "STS_TO_SEARCH_CAMPAIGNS\020\037\0229\n5CANNOT_SET_" +
      "BIDS_ON_CRITERION_TYPE_IN_SEARCH_CAMPAIG" +
      "NS\020 \0227\n3CANNOT_ADD_URLS_TO_CRITERION_TYP" +
      "E_FOR_CAMPAIGN_TYPE\020!\022\033\n\027INVALID_CUSTOM_" +
      "AFFINITY\020`\022\031\n\025INVALID_CUSTOM_INTENT\020a\022\026\n" +
      "\022INVALID_IP_ADDRESS\020\"\022\025\n\021INVALID_IP_FORM" +
      "AT\020#\022\026\n\022INVALID_MOBILE_APP\020$\022\037\n\033INVALID_" +
      "MOBILE_APP_CATEGORY\020%\022\030\n\024INVALID_CRITERI" +
      "ON_ID\020&\022\033\n\027CANNOT_TARGET_CRITERION\020\'\022$\n " +
      "CANNOT_TARGET_OBSOLETE_CRITERION\020(\022\"\n\036CR" +
      "ITERION_ID_AND_TYPE_MISMATCH\020)\022\034\n\030INVALI" +
      "D_PROXIMITY_RADIUS\020*\022\"\n\036INVALID_PROXIMIT" +
      "Y_RADIUS_UNITS\020+\022 \n\034INVALID_STREETADDRES" +
      "S_LENGTH\020,\022\033\n\027INVALID_CITYNAME_LENGTH\020-\022" +
      "\035\n\031INVALID_REGIONCODE_LENGTH\020.\022\035\n\031INVALI" +
      "D_REGIONNAME_LENGTH\020/\022\035\n\031INVALID_POSTALC" +
      "ODE_LENGTH\0200\022\030\n\024INVALID_COUNTRY_CODE\0201\022\024" +
      "\n\020INVALID_LATITUDE\0202\022\025\n\021INVALID_LONGITUD" +
      "E\0203\0226\n2PROXIMITY_GEOPOINT_AND_ADDRESS_BO" +
      "TH_CANNOT_BE_NULL\0204\022\035\n\031INVALID_PROXIMITY" +
      "_ADDRESS\0205\022\034\n\030INVALID_USER_DOMAIN_NAME\0206" +
      "\022 \n\034CRITERION_PARAMETER_TOO_LONG\0207\022&\n\"AD" +
      "_SCHEDULE_TIME_INTERVALS_OVERLAP\0208\0222\n.AD" +
      "_SCHEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_" +
      "DAYS\0209\022%\n!AD_SCHEDULE_INVALID_TIME_INTER" +
      "VAL\020:\0220\n,AD_SCHEDULE_EXCEEDED_INTERVALS_" +
      "PER_DAY_LIMIT\020;\022/\n+AD_SCHEDULE_CRITERION" +
      "_ID_MISMATCHING_FIELDS\020<\022$\n CANNOT_BID_M" +
      "ODIFY_CRITERION_TYPE\020=\0222\n.CANNOT_BID_MOD" +
      "IFY_CRITERION_CAMPAIGN_OPTED_OUT\020>\022(\n$CA" +
      "NNOT_BID_MODIFY_NEGATIVE_CRITERION\020?\022\037\n\033" +
      "BID_MODIFIER_ALREADY_EXISTS\020@\022\027\n\023FEED_ID" +
      "_NOT_ALLOWED\020A\022(\n$ACCOUNT_INELIGIBLE_FOR" +
      "_CRITERIA_TYPE\020B\022.\n*CRITERIA_TYPE_INVALI" +
      "D_FOR_BIDDING_STRATEGY\020C\022\034\n\030CANNOT_EXCLU" +
      "DE_CRITERION\020D\022\033\n\027CANNOT_REMOVE_CRITERIO" +
      "N\020E\022\032\n\026PRODUCT_SCOPE_TOO_LONG\020F\022%\n!PRODU" +
      "CT_SCOPE_TOO_MANY_DIMENSIONS\020G\022\036\n\032PRODUC" +
      "T_PARTITION_TOO_LONG\020H\022)\n%PRODUCT_PARTIT" +
      "ION_TOO_MANY_DIMENSIONS\020I\022\035\n\031INVALID_PRO" +
      "DUCT_DIMENSION\020J\022\"\n\036INVALID_PRODUCT_DIME" +
      "NSION_TYPE\020K\022$\n INVALID_PRODUCT_BIDDING_" +
      "CATEGORY\020L\022\034\n\030MISSING_SHOPPING_SETTING\020M" +
      "\022\035\n\031INVALID_MATCHING_FUNCTION\020N\022\037\n\033LOCAT" +
      "ION_FILTER_NOT_ALLOWED\020O\022$\n INVALID_FEED" +
      "_FOR_LOCATION_FILTER\020b\022\033\n\027LOCATION_FILTE" +
      "R_INVALID\020P\0222\n.CANNOT_ATTACH_CRITERIA_AT" +
      "_CAMPAIGN_AND_ADGROUP\020Q\0229\n5HOTEL_LENGTH_" +
      "OF_STAY_OVERLAPS_WITH_EXISTING_CRITERION" +
      "\020R\022A\n=HOTEL_ADVANCE_BOOKING_WINDOW_OVERL" +
      "APS_WITH_EXISTING_CRITERION\020S\022.\n*FIELD_I" +
      "NCOMPATIBLE_WITH_NEGATIVE_TARGETING\020T\022\035\n" +
      "\031INVALID_WEBPAGE_CONDITION\020U\022!\n\035INVALID_" +
      "WEBPAGE_CONDITION_URL\020V\022)\n%WEBPAGE_CONDI" +
      "TION_URL_CANNOT_BE_EMPTY\020W\022.\n*WEBPAGE_CO" +
      "NDITION_URL_UNSUPPORTED_PROTOCOL\020X\022.\n*WE" +
      "BPAGE_CONDITION_URL_CANNOT_BE_IP_ADDRESS" +
      "\020Y\022E\nAWEBPAGE_CONDITION_URL_DOMAIN_NOT_C" +
      "ONSISTENT_WITH_CAMPAIGN_SETTING\020Z\0221\n-WEB" +
      "PAGE_CONDITION_URL_CANNOT_BE_PUBLIC_SUFF" +
      "IX\020[\022/\n+WEBPAGE_CONDITION_URL_INVALID_PU" +
      "BLIC_SUFFIX\020\\\0229\n5WEBPAGE_CONDITION_URL_V" +
      "ALUE_TRACK_VALUE_NOT_SUPPORTED\020]\022<\n8WEBP" +
      "AGE_CRITERION_URL_EQUALS_CAN_HAVE_ONLY_O" +
      "NE_CONDITION\020^\0227\n3WEBPAGE_CRITERION_NOT_" +
      "SUPPORTED_ON_NON_DSA_AD_GROUP\020_\0227\n3CANNO" +
      "T_TARGET_USER_LIST_FOR_SMART_DISPLAY_CAM" +
      "PAIGNS\020c\022*\n&LISTING_SCOPE_TOO_MANY_DIMEN" +
      "SION_TYPES\020d\022\'\n#LISTING_SCOPE_TOO_MANY_I" +
      "N_OPERATORS\020e\022+\n\'LISTING_SCOPE_IN_OPERAT" +
      "OR_NOT_SUPPORTED\020f\022$\n DUPLICATE_LISTING_" +
      "DIMENSION_TYPE\020g\022%\n!DUPLICATE_LISTING_DI" +
      "MENSION_VALUE\020h\0220\n,CANNOT_SET_BIDS_ON_LI" +
      "STING_GROUP_SUBDIVISION\020iB\356\001\n\"com.google" +
      ".ads.googleads.v3.errorsB\023CriterionError" +
      "ProtoP\001ZDgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v3/errors;errors\242\002\003" +
      "GAA\252\002\036Google.Ads.GoogleAds.V3.Errors\312\002\036G" +
      "oogle\\Ads\\GoogleAds\\V3\\Errors\352\002\"Google::" +
      "Ads::GoogleAds::V3::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_errors_CriterionErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_errors_CriterionErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_errors_CriterionErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
