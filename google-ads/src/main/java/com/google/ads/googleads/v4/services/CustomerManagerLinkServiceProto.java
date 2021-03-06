// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/customer_manager_link_service.proto

package com.google.ads.googleads.v4.services;

public final class CustomerManagerLinkServiceProto {
  private CustomerManagerLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetCustomerManagerLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetCustomerManagerLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MoveManagerLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MoveManagerLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_CustomerManagerLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_CustomerManagerLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MoveManagerLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MoveManagerLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v4/services/custo" +
      "mer_manager_link_service.proto\022 google.a" +
      "ds.googleads.v4.services\032=google/ads/goo" +
      "gleads/v4/resources/customer_manager_lin" +
      "k.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032 google/protobuf/field_mask.proto\"l\n\035" +
      "GetCustomerManagerLinkRequest\022K\n\rresourc" +
      "e_name\030\001 \001(\tB4\340A\002\372A.\n,googleads.googleap" +
      "is.com/CustomerManagerLink\"\225\001\n MutateCus" +
      "tomerManagerLinkRequest\022\030\n\013customer_id\030\001" +
      " \001(\tB\003\340A\002\022W\n\noperations\030\002 \003(\0132>.google.a" +
      "ds.googleads.v4.services.CustomerManager" +
      "LinkOperationB\003\340A\002\"y\n\026MoveManagerLinkReq" +
      "uest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022+\n\036previo" +
      "us_customer_manager_link\030\002 \001(\tB\003\340A\002\022\030\n\013n" +
      "ew_manager\030\003 \001(\tB\003\340A\002\"\246\001\n\034CustomerManage" +
      "rLinkOperation\022/\n\013update_mask\030\004 \001(\0132\032.go" +
      "ogle.protobuf.FieldMask\022H\n\006update\030\002 \001(\0132" +
      "6.google.ads.googleads.v4.resources.Cust" +
      "omerManagerLinkH\000B\013\n\toperation\"w\n!Mutate" +
      "CustomerManagerLinkResponse\022R\n\007results\030\001" +
      " \003(\0132A.google.ads.googleads.v4.services." +
      "MutateCustomerManagerLinkResult\"0\n\027MoveM" +
      "anagerLinkResponse\022\025\n\rresource_name\030\001 \001(" +
      "\t\"8\n\037MutateCustomerManagerLinkResult\022\025\n\r" +
      "resource_name\030\001 \001(\t2\265\006\n\032CustomerManagerL" +
      "inkService\022\341\001\n\026GetCustomerManagerLink\022?." +
      "google.ads.googleads.v4.services.GetCust" +
      "omerManagerLinkRequest\0326.google.ads.goog" +
      "leads.v4.resources.CustomerManagerLink\"N" +
      "\202\323\344\223\0028\0226/v4/{resource_name=customers/*/c" +
      "ustomerManagerLinks/*}\332A\rresource_name\022\203" +
      "\002\n\031MutateCustomerManagerLink\022B.google.ad" +
      "s.googleads.v4.services.MutateCustomerMa" +
      "nagerLinkRequest\032C.google.ads.googleads." +
      "v4.services.MutateCustomerManagerLinkRes" +
      "ponse\"]\202\323\344\223\002>\"9/v4/customers/{customer_i" +
      "d=*}/customerManagerLinks:mutate:\001*\332A\026cu" +
      "stomer_id,operations\022\217\002\n\017MoveManagerLink" +
      "\0228.google.ads.googleads.v4.services.Move" +
      "ManagerLinkRequest\0329.google.ads.googlead" +
      "s.v4.services.MoveManagerLinkResponse\"\206\001" +
      "\202\323\344\223\002G\"B/v4/customers/{customer_id=*}/cu" +
      "stomerManagerLinks:moveManagerLink:\001*\332A6" +
      "customer_id,previous_customer_manager_li" +
      "nk,new_manager\032\033\312A\030googleads.googleapis." +
      "comB\206\002\n$com.google.ads.googleads.v4.serv" +
      "icesB\037CustomerManagerLinkServiceProtoP\001Z" +
      "Hgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v4/services;services\242\002\003GAA\252" +
      "\002 Google.Ads.GoogleAds.V4.Services\312\002 Goo" +
      "gle\\Ads\\GoogleAds\\V4\\Services\352\002$Google::" +
      "Ads::GoogleAds::V4::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.CustomerManagerLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetCustomerManagerLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetCustomerManagerLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetCustomerManagerLinkRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v4_services_MoveManagerLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_MoveManagerLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MoveManagerLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "PreviousCustomerManagerLink", "NewManager", });
    internal_static_google_ads_googleads_v4_services_CustomerManagerLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_CustomerManagerLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_CustomerManagerLinkOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Update", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v4_services_MoveManagerLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v4_services_MoveManagerLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MoveManagerLinkResponse_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCustomerManagerLinkResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.resources.CustomerManagerLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
