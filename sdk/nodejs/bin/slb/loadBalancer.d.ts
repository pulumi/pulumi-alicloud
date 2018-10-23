import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an Application Load Balancer resource.
 *
 * ~> **NOTE:** Resource `alicloud_slb` has deprecated 'listener' filed from terraform-alicloud-provider [version 1.3.0](https://github.com/alibaba/terraform-provider/releases/tag/V1.3.0) . You can create new listeners for Load Balancer by resource `alicloud_slb_listener`.
 * If you have had several listeners in one load balancer, you can import them via the specified listener ID. In the `alicloud_slb_listener`, listener ID is consist of load balancer ID and frontend port, and its format is `<load balancer ID>:<frontend port>`, like "lb-hr2fwnf32t:8080".
 *
 * ~> **NOTE:** At present, to avoid some unnecessary regulation confusion, SLB can not support alicloud international account to create "paybybandwidth" instance.
 */
export declare class LoadBalancer extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerState): LoadBalancer;
    /**
     * The IP address of the load balancer.
     */
    readonly address: pulumi.Output<string>;
    /**
     * Valid
     * value is between 1 and 1000, If argument "internet_charge_type" is "paybytraffic", then this value will be ignore.
     */
    readonly bandwidth: pulumi.Output<number | undefined>;
    readonly instances: pulumi.Output<string[] | undefined>;
    /**
     * If true, the SLB addressType will be internet, false will be intranet, Default is false. If load balancer launched in VPC, this value must be "false".
     */
    readonly internet: pulumi.Output<boolean | undefined>;
    /**
     * Valid
     * values are `PayByBandwidth`, `PayByTraffic`. If this value is "PayByBandwidth", then argument "internet" must be "true". Default is "PayByTraffic". If load balancer launched in VPC, this value must be "PayByTraffic".
     * Before version 1.10.1, the valid values are "paybybandwidth" and "paybytraffic".
     */
    readonly internetChargeType: pulumi.Output<string | undefined>;
    /**
     * The field has been deprecated from terraform-alicloud-provider [version 1.3.0](https://github.com/alibaba/terraform-provider/releases/tag/V1.3.0), and use resource `alicloud_slb_listener` to replace.
     */
    readonly listeners: pulumi.Output<{
        bandwidth: number;
        cookie: string;
        cookieTimeout: number;
        healthCheck: string;
        healthCheckConnectPort: number;
        healthCheckDomain: string;
        healthCheckHttpCode: string;
        healthCheckInterval: number;
        healthCheckTimeout: number;
        healthCheckType: string;
        healthCheckUri: string;
        healthyThreshold: number;
        instancePort: number;
        lbPort: number;
        lbProtocol: string;
        persistenceTimeout: number;
        scheduler: string;
        sslCertificateId: string;
        stickySession: string;
        stickySessionType: string;
        unhealthyThreshold: number;
    }[]>;
    /**
     * The name of the SLB. This name must be unique within your AliCloud account, can have a maximum of 80 characters,
     * must contain only alphanumeric characters or hyphens, such as "-","/",".","_", and must not begin or end with a hyphen. If not specified,
     * Terraform will autogenerate a name beginning with `tf-lb`.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
     * Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: "slb.s1.small", "slb.s2.small", "slb.s2.medium",
     * "slb.s3.small", "slb.s3.medium" and "slb.s3.large".
     */
    readonly specification: pulumi.Output<string | undefined>;
    /**
     * The VSwitch ID to launch in.
     */
    readonly vswitchId: pulumi.Output<string | undefined>;
    /**
     * Create a LoadBalancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: LoadBalancerArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering LoadBalancer resources.
 */
export interface LoadBalancerState {
    /**
     * The IP address of the load balancer.
     */
    readonly address?: pulumi.Input<string>;
    /**
     * Valid
     * value is between 1 and 1000, If argument "internet_charge_type" is "paybytraffic", then this value will be ignore.
     */
    readonly bandwidth?: pulumi.Input<number>;
    readonly instances?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If true, the SLB addressType will be internet, false will be intranet, Default is false. If load balancer launched in VPC, this value must be "false".
     */
    readonly internet?: pulumi.Input<boolean>;
    /**
     * Valid
     * values are `PayByBandwidth`, `PayByTraffic`. If this value is "PayByBandwidth", then argument "internet" must be "true". Default is "PayByTraffic". If load balancer launched in VPC, this value must be "PayByTraffic".
     * Before version 1.10.1, the valid values are "paybybandwidth" and "paybytraffic".
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * The field has been deprecated from terraform-alicloud-provider [version 1.3.0](https://github.com/alibaba/terraform-provider/releases/tag/V1.3.0), and use resource `alicloud_slb_listener` to replace.
     */
    readonly listeners?: pulumi.Input<pulumi.Input<{
        bandwidth?: pulumi.Input<number>;
        cookie?: pulumi.Input<string>;
        cookieTimeout?: pulumi.Input<number>;
        healthCheck?: pulumi.Input<string>;
        healthCheckConnectPort?: pulumi.Input<number>;
        healthCheckDomain?: pulumi.Input<string>;
        healthCheckHttpCode?: pulumi.Input<string>;
        healthCheckInterval?: pulumi.Input<number>;
        healthCheckTimeout?: pulumi.Input<number>;
        healthCheckType?: pulumi.Input<string>;
        healthCheckUri?: pulumi.Input<string>;
        healthyThreshold?: pulumi.Input<number>;
        instancePort?: pulumi.Input<number>;
        lbPort?: pulumi.Input<number>;
        lbProtocol?: pulumi.Input<string>;
        persistenceTimeout?: pulumi.Input<number>;
        scheduler?: pulumi.Input<string>;
        sslCertificateId?: pulumi.Input<string>;
        stickySession?: pulumi.Input<string>;
        stickySessionType?: pulumi.Input<string>;
        unhealthyThreshold?: pulumi.Input<number>;
    }>[]>;
    /**
     * The name of the SLB. This name must be unique within your AliCloud account, can have a maximum of 80 characters,
     * must contain only alphanumeric characters or hyphens, such as "-","/",".","_", and must not begin or end with a hyphen. If not specified,
     * Terraform will autogenerate a name beginning with `tf-lb`.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
     * Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: "slb.s1.small", "slb.s2.small", "slb.s2.medium",
     * "slb.s3.small", "slb.s3.medium" and "slb.s3.large".
     */
    readonly specification?: pulumi.Input<string>;
    /**
     * The VSwitch ID to launch in.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a LoadBalancer resource.
 */
export interface LoadBalancerArgs {
    /**
     * Valid
     * value is between 1 and 1000, If argument "internet_charge_type" is "paybytraffic", then this value will be ignore.
     */
    readonly bandwidth?: pulumi.Input<number>;
    readonly instances?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If true, the SLB addressType will be internet, false will be intranet, Default is false. If load balancer launched in VPC, this value must be "false".
     */
    readonly internet?: pulumi.Input<boolean>;
    /**
     * Valid
     * values are `PayByBandwidth`, `PayByTraffic`. If this value is "PayByBandwidth", then argument "internet" must be "true". Default is "PayByTraffic". If load balancer launched in VPC, this value must be "PayByTraffic".
     * Before version 1.10.1, the valid values are "paybybandwidth" and "paybytraffic".
     */
    readonly internetChargeType?: pulumi.Input<string>;
    /**
     * The field has been deprecated from terraform-alicloud-provider [version 1.3.0](https://github.com/alibaba/terraform-provider/releases/tag/V1.3.0), and use resource `alicloud_slb_listener` to replace.
     */
    readonly listeners?: pulumi.Input<pulumi.Input<{
        bandwidth?: pulumi.Input<number>;
        cookie?: pulumi.Input<string>;
        cookieTimeout?: pulumi.Input<number>;
        healthCheck?: pulumi.Input<string>;
        healthCheckConnectPort?: pulumi.Input<number>;
        healthCheckDomain?: pulumi.Input<string>;
        healthCheckHttpCode?: pulumi.Input<string>;
        healthCheckInterval?: pulumi.Input<number>;
        healthCheckTimeout?: pulumi.Input<number>;
        healthCheckType?: pulumi.Input<string>;
        healthCheckUri?: pulumi.Input<string>;
        healthyThreshold?: pulumi.Input<number>;
        instancePort?: pulumi.Input<number>;
        lbPort?: pulumi.Input<number>;
        lbProtocol?: pulumi.Input<string>;
        persistenceTimeout?: pulumi.Input<number>;
        scheduler?: pulumi.Input<string>;
        sslCertificateId?: pulumi.Input<string>;
        stickySession?: pulumi.Input<string>;
        stickySessionType?: pulumi.Input<string>;
        unhealthyThreshold?: pulumi.Input<number>;
    }>[]>;
    /**
     * The name of the SLB. This name must be unique within your AliCloud account, can have a maximum of 80 characters,
     * must contain only alphanumeric characters or hyphens, such as "-","/",".","_", and must not begin or end with a hyphen. If not specified,
     * Terraform will autogenerate a name beginning with `tf-lb`.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The specification of the Server Load Balancer instance. Default to empty string indicating it is "Shared-Performance" instance.
     * Launching "[Performance-guaranteed](https://www.alibabacloud.com/help/doc-detail/27657.htm)" instance, it is must be specified and it valid values are: "slb.s1.small", "slb.s2.small", "slb.s2.medium",
     * "slb.s3.small", "slb.s3.medium" and "slb.s3.large".
     */
    readonly specification?: pulumi.Input<string>;
    /**
     * The VSwitch ID to launch in.
     */
    readonly vswitchId?: pulumi.Input<string>;
}
