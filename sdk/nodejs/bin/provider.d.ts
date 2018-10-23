import * as pulumi from "@pulumi/pulumi";
/**
 * The provider type for the alicloud package
 */
export declare class Provider extends pulumi.ProviderResource {
    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProviderArgs, opts?: pulumi.ResourceOptions);
}
/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * Access key of alicloud
     */
    readonly accessKey: pulumi.Input<string>;
    /**
     * Alibaba Cloud account ID
     */
    readonly accountId?: pulumi.Input<string>;
    /**
     * Custom function compute endpoints
     */
    readonly fc?: pulumi.Input<string>;
    /**
     * Alibaba Cloud log service self-define endpoint
     */
    readonly logEndpoint?: pulumi.Input<string>;
    /**
     * Alibaba Cloud mns service self-define endpoint
     */
    readonly mnsEndpoint?: pulumi.Input<string>;
    readonly otsInstanceName?: pulumi.Input<string>;
    /**
     * Region of alicloud
     */
    readonly region: pulumi.Input<string>;
    /**
     * Secret key of alicloud
     */
    readonly secretKey: pulumi.Input<string>;
    /**
     * Alibaba Cloud Security Token
     */
    readonly securityToken?: pulumi.Input<string>;
}
