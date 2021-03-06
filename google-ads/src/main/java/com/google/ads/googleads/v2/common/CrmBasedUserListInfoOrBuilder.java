// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/user_lists.proto

package com.google.ads.googleads.v2.common;

public interface CrmBasedUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.CrmBasedUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A string that uniquely identifies a mobile application from which the data
   * was collected to the Google Ads API.
   * For iOS, the ID string is the 9 digit string that appears at the end of an
   * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
   * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, the ID string is the application's package name
   * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * Required when creating CrmBasedUserList for uploading mobile advertising
   * IDs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue app_id = 1;</code>
   * @return Whether the appId field is set.
   */
  boolean hasAppId();
  /**
   * <pre>
   * A string that uniquely identifies a mobile application from which the data
   * was collected to the Google Ads API.
   * For iOS, the ID string is the 9 digit string that appears at the end of an
   * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
   * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, the ID string is the application's package name
   * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * Required when creating CrmBasedUserList for uploading mobile advertising
   * IDs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue app_id = 1;</code>
   * @return The appId.
   */
  com.google.protobuf.StringValue getAppId();
  /**
   * <pre>
   * A string that uniquely identifies a mobile application from which the data
   * was collected to the Google Ads API.
   * For iOS, the ID string is the 9 digit string that appears at the end of an
   * App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is
   * http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, the ID string is the application's package name
   * (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * Required when creating CrmBasedUserList for uploading mobile advertising
   * IDs.
   * </pre>
   *
   * <code>.google.protobuf.StringValue app_id = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAppIdOrBuilder();

  /**
   * <pre>
   * Matching key type of the list.
   * Mixed data types are not allowed on the same list.
   * This field is required for an ADD operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
   * @return The enum numeric value on the wire for uploadKeyType.
   */
  int getUploadKeyTypeValue();
  /**
   * <pre>
   * Matching key type of the list.
   * Mixed data types are not allowed on the same list.
   * This field is required for an ADD operation.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType upload_key_type = 2;</code>
   * @return The uploadKeyType.
   */
  com.google.ads.googleads.v2.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType getUploadKeyType();

  /**
   * <pre>
   * Data source of the list. Default value is FIRST_PARTY.
   * Only whitelisted customers can create third-party sourced CRM lists.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
   * @return The enum numeric value on the wire for dataSourceType.
   */
  int getDataSourceTypeValue();
  /**
   * <pre>
   * Data source of the list. Default value is FIRST_PARTY.
   * Only whitelisted customers can create third-party sourced CRM lists.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType data_source_type = 3;</code>
   * @return The dataSourceType.
   */
  com.google.ads.googleads.v2.enums.UserListCrmDataSourceTypeEnum.UserListCrmDataSourceType getDataSourceType();
}
