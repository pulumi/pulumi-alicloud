// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Monitor Service Hybrid Double Write resource.
 *
 * For information about Cloud Monitor Service Hybrid Double Write and how to use it, see [What is Hybrid Double Write](https://next.api.alibabacloud.com/document/Cms/2018-03-08/CreateHybridDoubleWrite).
 *
 * > **NOTE:** Available since v1.210.0.
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
 * const name = config.get("name") || "tf-example";
 * const _default = alicloud.getAccount({});
 * const source = new alicloud.cms.Namespace("source", {namespace: name});
 * const defaultNamespace = new alicloud.cms.Namespace("default", {namespace: `${name}-source`});
 * const defaultServiceHybridDoubleWrite = new alicloud.cloudmonitor.ServiceHybridDoubleWrite("default", {
 *     sourceNamespace: source.id,
 *     sourceUserId: _default.then(_default => _default.id),
 *     namespace: defaultNamespace.id,
 *     userId: _default.then(_default => _default.id),
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Monitor Service Hybrid Double Write can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:cloudmonitor/serviceHybridDoubleWrite:ServiceHybridDoubleWrite example <source_namespace>:<source_user_id>
 * ```
 */
export class ServiceHybridDoubleWrite extends pulumi.CustomResource {
    /**
     * Get an existing ServiceHybridDoubleWrite resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceHybridDoubleWriteState, opts?: pulumi.CustomResourceOptions): ServiceHybridDoubleWrite {
        return new ServiceHybridDoubleWrite(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudmonitor/serviceHybridDoubleWrite:ServiceHybridDoubleWrite';

    /**
     * Returns true if the given object is an instance of ServiceHybridDoubleWrite.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceHybridDoubleWrite {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceHybridDoubleWrite.__pulumiType;
    }

    /**
     * Target Namespace.
     */
    public readonly namespace!: pulumi.Output<string>;
    /**
     * Source Namespace.
     */
    public readonly sourceNamespace!: pulumi.Output<string>;
    /**
     * Source UserId.
     */
    public readonly sourceUserId!: pulumi.Output<string>;
    /**
     * Target UserId.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a ServiceHybridDoubleWrite resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceHybridDoubleWriteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceHybridDoubleWriteArgs | ServiceHybridDoubleWriteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceHybridDoubleWriteState | undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["sourceNamespace"] = state ? state.sourceNamespace : undefined;
            resourceInputs["sourceUserId"] = state ? state.sourceUserId : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as ServiceHybridDoubleWriteArgs | undefined;
            if ((!args || args.namespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespace'");
            }
            if ((!args || args.sourceNamespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceNamespace'");
            }
            if ((!args || args.sourceUserId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceUserId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["sourceNamespace"] = args ? args.sourceNamespace : undefined;
            resourceInputs["sourceUserId"] = args ? args.sourceUserId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceHybridDoubleWrite.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceHybridDoubleWrite resources.
 */
export interface ServiceHybridDoubleWriteState {
    /**
     * Target Namespace.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Source Namespace.
     */
    sourceNamespace?: pulumi.Input<string>;
    /**
     * Source UserId.
     */
    sourceUserId?: pulumi.Input<string>;
    /**
     * Target UserId.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceHybridDoubleWrite resource.
 */
export interface ServiceHybridDoubleWriteArgs {
    /**
     * Target Namespace.
     */
    namespace: pulumi.Input<string>;
    /**
     * Source Namespace.
     */
    sourceNamespace: pulumi.Input<string>;
    /**
     * Source UserId.
     */
    sourceUserId: pulumi.Input<string>;
    /**
     * Target UserId.
     */
    userId: pulumi.Input<string>;
}
