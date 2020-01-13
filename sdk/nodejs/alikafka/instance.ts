// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an ALIKAFKA instance resource.
 * 
 * > **NOTE:** Available in 1.59.0+
 * 
 * > **NOTE:** ALIKAFKA instance resource only support create post pay instance. Creation or modification may took about 10-40 minutes.
 * 
 * > **NOTE:** Only the following regions support create alikafka pre paid instance.
 * [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`ap-southeast-1`,`ap-south-1`,`ap-southeast-5`]
 * 
 * > **NOTE:** Only the following regions support create alikafka post paid instance.
 * [`cn-hangzhou`,`cn-beijing`,`cn-shenzhen`,`cn-shanghai`,`cn-qingdao`,`cn-hongkong`,`cn-huhehaote`,`cn-zhangjiakou`,`ap-southeast-1`]
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const config = new pulumi.Config();
 * const instanceName = config.get("instanceName") || "alikafkaInstanceName";
 * 
 * const defaultZones = alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * });
 * const defaultNetwork = new alicloud.vpc.Network("default", {
 *     cidrBlock: "172.16.0.0/12",
 * });
 * const defaultSwitch = new alicloud.vpc.Switch("default", {
 *     availabilityZone: defaultZones.zones[0].id,
 *     cidrBlock: "172.16.0.0/24",
 *     vpcId: defaultNetwork.id,
 * });
 * const defaultInstance = new alicloud.alikafka.Instance("default", {
 *     deployType: 4,
 *     diskSize: 500,
 *     diskType: 1,
 *     ioMax: 20,
 *     topicQuota: 50,
 *     vswitchId: defaultSwitch.id,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/alikafka_instance.html.markdown.
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:alikafka/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    /**
     * The deploy type of the instance. Currently only support two deploy type, 4: eip/vpc instance, 5: vpc instance.
     */
    public readonly deployType!: pulumi.Output<number>;
    /**
     * The disk size of the instance. When modify this value, it only support adjust to a greater value.
     */
    public readonly diskSize!: pulumi.Output<number>;
    /**
     * The disk type of the instance. 0: efficient cloud disk , 1: SSD.
     */
    public readonly diskType!: pulumi.Output<number>;
    /**
     * The max bandwidth of the instance. When modify this value, it only support adjust to a greater value.
     */
    public readonly eipMax!: pulumi.Output<number | undefined>;
    /**
     * The max value of io of the instance. When modify this value, it only support adjust to a greater value.
     */
    public readonly ioMax!: pulumi.Output<number>;
    /**
     * Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The paid type of the instance. Support two type, "PrePaid": pre paid type instance, "PostPaid": post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay. 
     */
    public readonly paidType!: pulumi.Output<string | undefined>;
    /**
     * The spec type of the instance. Support two type, "normal": normal version instance, "professional": professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
     */
    public readonly specType!: pulumi.Output<string | undefined>;
    /**
     * A mapping of tags to assign to the resource.
     */
    public readonly tags!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The max num of topic can be create of the instance. When modify this value, it only adjust to a greater value.
     */
    public readonly topicQuota!: pulumi.Output<number>;
    /**
     * The ID of attaching VPC to instance.
     */
    public /*out*/ readonly vpcId!: pulumi.Output<string>;
    /**
     * The ID of attaching vswitch to instance.
     */
    public readonly vswitchId!: pulumi.Output<string>;
    /**
     * The Zone to launch the kafka instance.
     */
    public /*out*/ readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as InstanceState | undefined;
            inputs["deployType"] = state ? state.deployType : undefined;
            inputs["diskSize"] = state ? state.diskSize : undefined;
            inputs["diskType"] = state ? state.diskType : undefined;
            inputs["eipMax"] = state ? state.eipMax : undefined;
            inputs["ioMax"] = state ? state.ioMax : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["paidType"] = state ? state.paidType : undefined;
            inputs["specType"] = state ? state.specType : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["topicQuota"] = state ? state.topicQuota : undefined;
            inputs["vpcId"] = state ? state.vpcId : undefined;
            inputs["vswitchId"] = state ? state.vswitchId : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if (!args || args.deployType === undefined) {
                throw new Error("Missing required property 'deployType'");
            }
            if (!args || args.diskSize === undefined) {
                throw new Error("Missing required property 'diskSize'");
            }
            if (!args || args.diskType === undefined) {
                throw new Error("Missing required property 'diskType'");
            }
            if (!args || args.ioMax === undefined) {
                throw new Error("Missing required property 'ioMax'");
            }
            if (!args || args.topicQuota === undefined) {
                throw new Error("Missing required property 'topicQuota'");
            }
            if (!args || args.vswitchId === undefined) {
                throw new Error("Missing required property 'vswitchId'");
            }
            inputs["deployType"] = args ? args.deployType : undefined;
            inputs["diskSize"] = args ? args.diskSize : undefined;
            inputs["diskType"] = args ? args.diskType : undefined;
            inputs["eipMax"] = args ? args.eipMax : undefined;
            inputs["ioMax"] = args ? args.ioMax : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["paidType"] = args ? args.paidType : undefined;
            inputs["specType"] = args ? args.specType : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["topicQuota"] = args ? args.topicQuota : undefined;
            inputs["vswitchId"] = args ? args.vswitchId : undefined;
            inputs["vpcId"] = undefined /*out*/;
            inputs["zoneId"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Instance.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * The deploy type of the instance. Currently only support two deploy type, 4: eip/vpc instance, 5: vpc instance.
     */
    readonly deployType?: pulumi.Input<number>;
    /**
     * The disk size of the instance. When modify this value, it only support adjust to a greater value.
     */
    readonly diskSize?: pulumi.Input<number>;
    /**
     * The disk type of the instance. 0: efficient cloud disk , 1: SSD.
     */
    readonly diskType?: pulumi.Input<number>;
    /**
     * The max bandwidth of the instance. When modify this value, it only support adjust to a greater value.
     */
    readonly eipMax?: pulumi.Input<number>;
    /**
     * The max value of io of the instance. When modify this value, it only support adjust to a greater value.
     */
    readonly ioMax?: pulumi.Input<number>;
    /**
     * Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The paid type of the instance. Support two type, "PrePaid": pre paid type instance, "PostPaid": post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay. 
     */
    readonly paidType?: pulumi.Input<string>;
    /**
     * The spec type of the instance. Support two type, "normal": normal version instance, "professional": professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
     */
    readonly specType?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The max num of topic can be create of the instance. When modify this value, it only adjust to a greater value.
     */
    readonly topicQuota?: pulumi.Input<number>;
    /**
     * The ID of attaching VPC to instance.
     */
    readonly vpcId?: pulumi.Input<string>;
    /**
     * The ID of attaching vswitch to instance.
     */
    readonly vswitchId?: pulumi.Input<string>;
    /**
     * The Zone to launch the kafka instance.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * The deploy type of the instance. Currently only support two deploy type, 4: eip/vpc instance, 5: vpc instance.
     */
    readonly deployType: pulumi.Input<number>;
    /**
     * The disk size of the instance. When modify this value, it only support adjust to a greater value.
     */
    readonly diskSize: pulumi.Input<number>;
    /**
     * The disk type of the instance. 0: efficient cloud disk , 1: SSD.
     */
    readonly diskType: pulumi.Input<number>;
    /**
     * The max bandwidth of the instance. When modify this value, it only support adjust to a greater value.
     */
    readonly eipMax?: pulumi.Input<number>;
    /**
     * The max value of io of the instance. When modify this value, it only support adjust to a greater value.
     */
    readonly ioMax: pulumi.Input<number>;
    /**
     * Name of your Kafka instance. The length should between 3 and 64 characters. If not set, will use instance id as instance name.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The paid type of the instance. Support two type, "PrePaid": pre paid type instance, "PostPaid": post paid type instance. Default is PostPaid. When modify this value, it only support adjust from post pay to pre pay. 
     */
    readonly paidType?: pulumi.Input<string>;
    /**
     * The spec type of the instance. Support two type, "normal": normal version instance, "professional": professional version instance. Default is normal. When modify this value, it only support adjust from normal to professional. Note only pre paid type instance support professional specific type.
     */
    readonly specType?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The max num of topic can be create of the instance. When modify this value, it only adjust to a greater value.
     */
    readonly topicQuota: pulumi.Input<number>;
    /**
     * The ID of attaching vswitch to instance.
     */
    readonly vswitchId: pulumi.Input<string>;
}