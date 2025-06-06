// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a File Storage (NAS) Fileset resource.
 *
 * For information about File Storage (NAS) Fileset and how to use it, see [What is Fileset](https://www.alibabacloud.com/help/en/doc-detail/27530.html).
 *
 * > **NOTE:** Available since v1.153.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.nas.getZones({
 *     fileSystemType: "cpfs",
 * });
 * const exampleNetwork = new alicloud.vpc.Network("example", {
 *     vpcName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 * });
 * const exampleSwitch = new alicloud.vpc.Switch("example", {
 *     vswitchName: "terraform-example",
 *     cidrBlock: "172.17.3.0/24",
 *     vpcId: exampleNetwork.id,
 *     zoneId: example.then(example => example.zones?.[1]?.zoneId),
 * });
 * const exampleFileSystem = new alicloud.nas.FileSystem("example", {
 *     protocolType: "cpfs",
 *     storageType: "advance_200",
 *     fileSystemType: "cpfs",
 *     capacity: 3600,
 *     zoneId: example.then(example => example.zones?.[1]?.zoneId),
 *     vpcId: exampleNetwork.id,
 *     vswitchId: exampleSwitch.id,
 * });
 * const exampleFileset = new alicloud.nas.Fileset("example", {
 *     fileSystemId: exampleFileSystem.id,
 *     description: "terraform-example",
 *     fileSystemPath: "/example_path/",
 * });
 * ```
 *
 * ## Import
 *
 * File Storage (NAS) Fileset can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:nas/fileset:Fileset example <file_system_id>:<fileset_id>
 * ```
 */
export class Fileset extends pulumi.CustomResource {
    /**
     * Get an existing Fileset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FilesetState, opts?: pulumi.CustomResourceOptions): Fileset {
        return new Fileset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:nas/fileset:Fileset';

    /**
     * Returns true if the given object is an instance of Fileset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Fileset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Fileset.__pulumiType;
    }

    /**
     * The description of the Fileset. It must be `2` to `128` characters in length and must start with a letter or Chinese, but cannot start with `https://` or `https://`.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The dry run.
     */
    public readonly dryRun!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the file system.
     */
    public readonly fileSystemId!: pulumi.Output<string>;
    /**
     * The path of the fileset.
     */
    public readonly fileSystemPath!: pulumi.Output<string>;
    /**
     * The first ID of the resource.
     */
    public /*out*/ readonly filesetId!: pulumi.Output<string>;
    /**
     * The status of the fileset.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a Fileset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FilesetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FilesetArgs | FilesetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FilesetState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dryRun"] = state ? state.dryRun : undefined;
            resourceInputs["fileSystemId"] = state ? state.fileSystemId : undefined;
            resourceInputs["fileSystemPath"] = state ? state.fileSystemPath : undefined;
            resourceInputs["filesetId"] = state ? state.filesetId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as FilesetArgs | undefined;
            if ((!args || args.fileSystemId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileSystemId'");
            }
            if ((!args || args.fileSystemPath === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileSystemPath'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dryRun"] = args ? args.dryRun : undefined;
            resourceInputs["fileSystemId"] = args ? args.fileSystemId : undefined;
            resourceInputs["fileSystemPath"] = args ? args.fileSystemPath : undefined;
            resourceInputs["filesetId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Fileset.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Fileset resources.
 */
export interface FilesetState {
    /**
     * The description of the Fileset. It must be `2` to `128` characters in length and must start with a letter or Chinese, but cannot start with `https://` or `https://`.
     */
    description?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The ID of the file system.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * The path of the fileset.
     */
    fileSystemPath?: pulumi.Input<string>;
    /**
     * The first ID of the resource.
     */
    filesetId?: pulumi.Input<string>;
    /**
     * The status of the fileset.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Fileset resource.
 */
export interface FilesetArgs {
    /**
     * The description of the Fileset. It must be `2` to `128` characters in length and must start with a letter or Chinese, but cannot start with `https://` or `https://`.
     */
    description?: pulumi.Input<string>;
    /**
     * The dry run.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * The ID of the file system.
     */
    fileSystemId: pulumi.Input<string>;
    /**
     * The path of the fileset.
     */
    fileSystemPath: pulumi.Input<string>;
}
