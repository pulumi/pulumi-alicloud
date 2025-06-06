// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Firewall Control Policy resource.
 *
 * For information about Cloud Firewall Control Policy and how to use it, see [What is Control Policy](https://www.alibabacloud.com/help/doc-detail/138867.htm).
 *
 * > **NOTE:** Available since v1.129.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform-example";
 * const _default = new alicloud.cloudfirewall.ControlPolicy("default", {
 *     direction: "in",
 *     applicationName: "ANY",
 *     description: name,
 *     aclAction: "accept",
 *     source: "127.0.0.1/32",
 *     sourceType: "net",
 *     destination: "127.0.0.2/32",
 *     destinationType: "net",
 *     proto: "ANY",
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Firewall Control Policy can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudfirewall/controlPolicy:ControlPolicy example <acl_uuid>:<direction>
 * ```
 */
export class ControlPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ControlPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ControlPolicyState, opts?: pulumi.CustomResourceOptions): ControlPolicy {
        return new ControlPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudfirewall/controlPolicy:ControlPolicy';

    /**
     * Returns true if the given object is an instance of ControlPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ControlPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ControlPolicy.__pulumiType;
    }

    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     */
    public readonly aclAction!: pulumi.Output<string>;
    /**
     * (Available since v1.148.0) The unique ID of the access control policy.
     */
    public /*out*/ readonly aclUuid!: pulumi.Output<string>;
    /**
     * The application type supported by the access control policy. Valid values: `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
     * > **NOTE:** If `proto` is set to `TCP`, you can set `applicationName` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `applicationName` to `ANY`.
     */
    public readonly applicationName!: pulumi.Output<string | undefined>;
    /**
     * The application types supported by the access control policy.
     * > **NOTE:** If `proto` is set to `TCP`, you can set `applicationNameList` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `applicationNameList` to `["ANY"]`. From version 1.232.0, You must specify at least one of the `applicationNameList` and `applicationName`. If you specify both `applicationNameList` and `applicationName`, only the `applicationNameList` takes effect.
     */
    public readonly applicationNameLists!: pulumi.Output<string[] | undefined>;
    /**
     * (Available since v1.232.0) The time when the access control policy was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The description of the access control policy.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The destination port in the access control policy. **Note:** If `destPortType` is set to `port`, you must specify `destPort`.
     */
    public readonly destPort!: pulumi.Output<string>;
    /**
     * The name of the destination port address book in the access control policy. **Note:** If `destPortType` is set to `group`, you must specify `destPortGroup`.
     */
    public readonly destPortGroup!: pulumi.Output<string | undefined>;
    /**
     * The type of the destination port in the access control policy. Valid values: `port`, `group`.
     */
    public readonly destPortType!: pulumi.Output<string>;
    /**
     * The destination address in the access control policy.
     */
    public readonly destination!: pulumi.Output<string>;
    /**
     * The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`, `location`.
     */
    public readonly destinationType!: pulumi.Output<string>;
    /**
     * The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
     */
    public readonly direction!: pulumi.Output<string>;
    /**
     * The domain name resolution method of the access control policy. Valid values:
     * - `FQDN`: Fully qualified domain name (FQDN)-based resolution.
     * - `DNS`: DNS-based dynamic resolution.
     * - `FQDN_AND_DNS`: FQDN and DNS-based dynamic resolution.
     */
    public readonly domainResolveType!: pulumi.Output<string | undefined>;
    /**
     * The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * > **NOTE:** If `repeatType` is set to `None`, `Daily`, `Weekly`, or `Monthly`, `startTime` and `endTime` must be set.
     */
    public readonly endTime!: pulumi.Output<number | undefined>;
    /**
     * The IP version supported by the access control policy. Default value: `4`. Valid values:
     */
    public readonly ipVersion!: pulumi.Output<string>;
    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     */
    public readonly lang!: pulumi.Output<string | undefined>;
    /**
     * The protocol type supported by the access control policy. Valid values: `ANY`, ` TCP`, `UDP`, `ICMP`.
     */
    public readonly proto!: pulumi.Output<string>;
    /**
     * The status of the access control policy. Valid values: `true`, `false`.
     */
    public readonly release!: pulumi.Output<string>;
    /**
     * The days of a week or of a month on which the access control policy takes effect. Valid values:
     * - If `repeatType` is set to `Weekly`. Valid values: `0` to `6`.
     * - If `repeatType` is set to `Monthly`. Valid values: `1` to `31`.
     * > **NOTE:** If `repeatType` is set to `Weekly`, or `Monthly`, `repeatDays` must be set.
     */
    public readonly repeatDays!: pulumi.Output<number[] | undefined>;
    /**
     * The point in time when the recurrence ends. Example: `23:30`. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * > **NOTE:** If `repeatType` is set to `Daily`, `Weekly`, or `Monthly`, `repeatStartTime` and `repeatEndTime` must be set.
     */
    public readonly repeatEndTime!: pulumi.Output<string | undefined>;
    /**
     * The point in time when the recurrence starts. Example: `08:00`. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     */
    public readonly repeatStartTime!: pulumi.Output<string | undefined>;
    /**
     * The recurrence type for the access control policy to take effect. Default value: `Permanent`. Valid values:
     * - `Permanent`: The policy always takes effect.
     * - `None`: The policy takes effect for only once.
     * - `Daily`: The policy takes effect on a daily basis.
     * - `Weekly`: The policy takes effect on a weekly basis.
     * - `Monthly`: The policy takes effect on a monthly basis.
     */
    public readonly repeatType!: pulumi.Output<string>;
    /**
     * The source address in the access control policy.
     */
    public readonly source!: pulumi.Output<string>;
    /**
     * The source IP address of the request.
     */
    public readonly sourceIp!: pulumi.Output<string | undefined>;
    /**
     * The type of the source address in the access control policy. Valid values: `net`, `group`, `location`.
     */
    public readonly sourceType!: pulumi.Output<string>;
    /**
     * The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     */
    public readonly startTime!: pulumi.Output<number | undefined>;

    /**
     * Create a ControlPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ControlPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ControlPolicyArgs | ControlPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ControlPolicyState | undefined;
            resourceInputs["aclAction"] = state ? state.aclAction : undefined;
            resourceInputs["aclUuid"] = state ? state.aclUuid : undefined;
            resourceInputs["applicationName"] = state ? state.applicationName : undefined;
            resourceInputs["applicationNameLists"] = state ? state.applicationNameLists : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destPort"] = state ? state.destPort : undefined;
            resourceInputs["destPortGroup"] = state ? state.destPortGroup : undefined;
            resourceInputs["destPortType"] = state ? state.destPortType : undefined;
            resourceInputs["destination"] = state ? state.destination : undefined;
            resourceInputs["destinationType"] = state ? state.destinationType : undefined;
            resourceInputs["direction"] = state ? state.direction : undefined;
            resourceInputs["domainResolveType"] = state ? state.domainResolveType : undefined;
            resourceInputs["endTime"] = state ? state.endTime : undefined;
            resourceInputs["ipVersion"] = state ? state.ipVersion : undefined;
            resourceInputs["lang"] = state ? state.lang : undefined;
            resourceInputs["proto"] = state ? state.proto : undefined;
            resourceInputs["release"] = state ? state.release : undefined;
            resourceInputs["repeatDays"] = state ? state.repeatDays : undefined;
            resourceInputs["repeatEndTime"] = state ? state.repeatEndTime : undefined;
            resourceInputs["repeatStartTime"] = state ? state.repeatStartTime : undefined;
            resourceInputs["repeatType"] = state ? state.repeatType : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["sourceIp"] = state ? state.sourceIp : undefined;
            resourceInputs["sourceType"] = state ? state.sourceType : undefined;
            resourceInputs["startTime"] = state ? state.startTime : undefined;
        } else {
            const args = argsOrState as ControlPolicyArgs | undefined;
            if ((!args || args.aclAction === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aclAction'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.destination === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destination'");
            }
            if ((!args || args.destinationType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationType'");
            }
            if ((!args || args.direction === undefined) && !opts.urn) {
                throw new Error("Missing required property 'direction'");
            }
            if ((!args || args.proto === undefined) && !opts.urn) {
                throw new Error("Missing required property 'proto'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            if ((!args || args.sourceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceType'");
            }
            resourceInputs["aclAction"] = args ? args.aclAction : undefined;
            resourceInputs["applicationName"] = args ? args.applicationName : undefined;
            resourceInputs["applicationNameLists"] = args ? args.applicationNameLists : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["destPort"] = args ? args.destPort : undefined;
            resourceInputs["destPortGroup"] = args ? args.destPortGroup : undefined;
            resourceInputs["destPortType"] = args ? args.destPortType : undefined;
            resourceInputs["destination"] = args ? args.destination : undefined;
            resourceInputs["destinationType"] = args ? args.destinationType : undefined;
            resourceInputs["direction"] = args ? args.direction : undefined;
            resourceInputs["domainResolveType"] = args ? args.domainResolveType : undefined;
            resourceInputs["endTime"] = args ? args.endTime : undefined;
            resourceInputs["ipVersion"] = args ? args.ipVersion : undefined;
            resourceInputs["lang"] = args ? args.lang : undefined;
            resourceInputs["proto"] = args ? args.proto : undefined;
            resourceInputs["release"] = args ? args.release : undefined;
            resourceInputs["repeatDays"] = args ? args.repeatDays : undefined;
            resourceInputs["repeatEndTime"] = args ? args.repeatEndTime : undefined;
            resourceInputs["repeatStartTime"] = args ? args.repeatStartTime : undefined;
            resourceInputs["repeatType"] = args ? args.repeatType : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["sourceIp"] = args ? args.sourceIp : undefined;
            resourceInputs["sourceType"] = args ? args.sourceType : undefined;
            resourceInputs["startTime"] = args ? args.startTime : undefined;
            resourceInputs["aclUuid"] = undefined /*out*/;
            resourceInputs["createTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ControlPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ControlPolicy resources.
 */
export interface ControlPolicyState {
    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     */
    aclAction?: pulumi.Input<string>;
    /**
     * (Available since v1.148.0) The unique ID of the access control policy.
     */
    aclUuid?: pulumi.Input<string>;
    /**
     * The application type supported by the access control policy. Valid values: `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
     * > **NOTE:** If `proto` is set to `TCP`, you can set `applicationName` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `applicationName` to `ANY`.
     */
    applicationName?: pulumi.Input<string>;
    /**
     * The application types supported by the access control policy.
     * > **NOTE:** If `proto` is set to `TCP`, you can set `applicationNameList` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `applicationNameList` to `["ANY"]`. From version 1.232.0, You must specify at least one of the `applicationNameList` and `applicationName`. If you specify both `applicationNameList` and `applicationName`, only the `applicationNameList` takes effect.
     */
    applicationNameLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Available since v1.232.0) The time when the access control policy was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * The description of the access control policy.
     */
    description?: pulumi.Input<string>;
    /**
     * The destination port in the access control policy. **Note:** If `destPortType` is set to `port`, you must specify `destPort`.
     */
    destPort?: pulumi.Input<string>;
    /**
     * The name of the destination port address book in the access control policy. **Note:** If `destPortType` is set to `group`, you must specify `destPortGroup`.
     */
    destPortGroup?: pulumi.Input<string>;
    /**
     * The type of the destination port in the access control policy. Valid values: `port`, `group`.
     */
    destPortType?: pulumi.Input<string>;
    /**
     * The destination address in the access control policy.
     */
    destination?: pulumi.Input<string>;
    /**
     * The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`, `location`.
     */
    destinationType?: pulumi.Input<string>;
    /**
     * The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
     */
    direction?: pulumi.Input<string>;
    /**
     * The domain name resolution method of the access control policy. Valid values:
     * - `FQDN`: Fully qualified domain name (FQDN)-based resolution.
     * - `DNS`: DNS-based dynamic resolution.
     * - `FQDN_AND_DNS`: FQDN and DNS-based dynamic resolution.
     */
    domainResolveType?: pulumi.Input<string>;
    /**
     * The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * > **NOTE:** If `repeatType` is set to `None`, `Daily`, `Weekly`, or `Monthly`, `startTime` and `endTime` must be set.
     */
    endTime?: pulumi.Input<number>;
    /**
     * The IP version supported by the access control policy. Default value: `4`. Valid values:
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     */
    lang?: pulumi.Input<string>;
    /**
     * The protocol type supported by the access control policy. Valid values: `ANY`, ` TCP`, `UDP`, `ICMP`.
     */
    proto?: pulumi.Input<string>;
    /**
     * The status of the access control policy. Valid values: `true`, `false`.
     */
    release?: pulumi.Input<string>;
    /**
     * The days of a week or of a month on which the access control policy takes effect. Valid values:
     * - If `repeatType` is set to `Weekly`. Valid values: `0` to `6`.
     * - If `repeatType` is set to `Monthly`. Valid values: `1` to `31`.
     * > **NOTE:** If `repeatType` is set to `Weekly`, or `Monthly`, `repeatDays` must be set.
     */
    repeatDays?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The point in time when the recurrence ends. Example: `23:30`. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * > **NOTE:** If `repeatType` is set to `Daily`, `Weekly`, or `Monthly`, `repeatStartTime` and `repeatEndTime` must be set.
     */
    repeatEndTime?: pulumi.Input<string>;
    /**
     * The point in time when the recurrence starts. Example: `08:00`. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     */
    repeatStartTime?: pulumi.Input<string>;
    /**
     * The recurrence type for the access control policy to take effect. Default value: `Permanent`. Valid values:
     * - `Permanent`: The policy always takes effect.
     * - `None`: The policy takes effect for only once.
     * - `Daily`: The policy takes effect on a daily basis.
     * - `Weekly`: The policy takes effect on a weekly basis.
     * - `Monthly`: The policy takes effect on a monthly basis.
     */
    repeatType?: pulumi.Input<string>;
    /**
     * The source address in the access control policy.
     */
    source?: pulumi.Input<string>;
    /**
     * The source IP address of the request.
     */
    sourceIp?: pulumi.Input<string>;
    /**
     * The type of the source address in the access control policy. Valid values: `net`, `group`, `location`.
     */
    sourceType?: pulumi.Input<string>;
    /**
     * The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     */
    startTime?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ControlPolicy resource.
 */
export interface ControlPolicyArgs {
    /**
     * The action that Cloud Firewall performs on the traffic. Valid values: `accept`, `drop`, `log`.
     */
    aclAction: pulumi.Input<string>;
    /**
     * The application type supported by the access control policy. Valid values: `ANY`, `HTTP`, `HTTPS`, `MQTT`, `Memcache`, `MongoDB`, `MySQL`, `RDP`, `Redis`, `SMTP`, `SMTPS`, `SSH`, `SSL`, `VNC`.
     * > **NOTE:** If `proto` is set to `TCP`, you can set `applicationName` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `applicationName` to `ANY`.
     */
    applicationName?: pulumi.Input<string>;
    /**
     * The application types supported by the access control policy.
     * > **NOTE:** If `proto` is set to `TCP`, you can set `applicationNameList` to any valid value. If `proto` is set to `UDP`, `ICMP`, or `ANY`, you can only set `applicationNameList` to `["ANY"]`. From version 1.232.0, You must specify at least one of the `applicationNameList` and `applicationName`. If you specify both `applicationNameList` and `applicationName`, only the `applicationNameList` takes effect.
     */
    applicationNameLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description of the access control policy.
     */
    description: pulumi.Input<string>;
    /**
     * The destination port in the access control policy. **Note:** If `destPortType` is set to `port`, you must specify `destPort`.
     */
    destPort?: pulumi.Input<string>;
    /**
     * The name of the destination port address book in the access control policy. **Note:** If `destPortType` is set to `group`, you must specify `destPortGroup`.
     */
    destPortGroup?: pulumi.Input<string>;
    /**
     * The type of the destination port in the access control policy. Valid values: `port`, `group`.
     */
    destPortType?: pulumi.Input<string>;
    /**
     * The destination address in the access control policy.
     */
    destination: pulumi.Input<string>;
    /**
     * The type of the destination address in the access control policy. Valid values: `net`, `group`, `domain`, `location`.
     */
    destinationType: pulumi.Input<string>;
    /**
     * The direction of the traffic to which the access control policy applies. Valid values: `in`, `out`.
     */
    direction: pulumi.Input<string>;
    /**
     * The domain name resolution method of the access control policy. Valid values:
     * - `FQDN`: Fully qualified domain name (FQDN)-based resolution.
     * - `DNS`: DNS-based dynamic resolution.
     * - `FQDN_AND_DNS`: FQDN and DNS-based dynamic resolution.
     */
    domainResolveType?: pulumi.Input<string>;
    /**
     * The time when the access control policy stops taking effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * > **NOTE:** If `repeatType` is set to `None`, `Daily`, `Weekly`, or `Monthly`, `startTime` and `endTime` must be set.
     */
    endTime?: pulumi.Input<number>;
    /**
     * The IP version supported by the access control policy. Default value: `4`. Valid values:
     */
    ipVersion?: pulumi.Input<string>;
    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     */
    lang?: pulumi.Input<string>;
    /**
     * The protocol type supported by the access control policy. Valid values: `ANY`, ` TCP`, `UDP`, `ICMP`.
     */
    proto: pulumi.Input<string>;
    /**
     * The status of the access control policy. Valid values: `true`, `false`.
     */
    release?: pulumi.Input<string>;
    /**
     * The days of a week or of a month on which the access control policy takes effect. Valid values:
     * - If `repeatType` is set to `Weekly`. Valid values: `0` to `6`.
     * - If `repeatType` is set to `Monthly`. Valid values: `1` to `31`.
     * > **NOTE:** If `repeatType` is set to `Weekly`, or `Monthly`, `repeatDays` must be set.
     */
    repeatDays?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The point in time when the recurrence ends. Example: `23:30`. The end time must be on the hour or on the half hour, and at least 30 minutes later than the start time.
     * > **NOTE:** If `repeatType` is set to `Daily`, `Weekly`, or `Monthly`, `repeatStartTime` and `repeatEndTime` must be set.
     */
    repeatEndTime?: pulumi.Input<string>;
    /**
     * The point in time when the recurrence starts. Example: `08:00`. The start time must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     */
    repeatStartTime?: pulumi.Input<string>;
    /**
     * The recurrence type for the access control policy to take effect. Default value: `Permanent`. Valid values:
     * - `Permanent`: The policy always takes effect.
     * - `None`: The policy takes effect for only once.
     * - `Daily`: The policy takes effect on a daily basis.
     * - `Weekly`: The policy takes effect on a weekly basis.
     * - `Monthly`: The policy takes effect on a monthly basis.
     */
    repeatType?: pulumi.Input<string>;
    /**
     * The source address in the access control policy.
     */
    source: pulumi.Input<string>;
    /**
     * The source IP address of the request.
     */
    sourceIp?: pulumi.Input<string>;
    /**
     * The type of the source address in the access control policy. Valid values: `net`, `group`, `location`.
     */
    sourceType: pulumi.Input<string>;
    /**
     * The time when the access control policy starts to take effect. The value is a UNIX timestamp. Unit: seconds. The value must be on the hour or on the half hour, and at least 30 minutes earlier than the end time.
     */
    startTime?: pulumi.Input<number>;
}
