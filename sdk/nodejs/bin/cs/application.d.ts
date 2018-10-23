import * as pulumi from "@pulumi/pulumi";
/**
 * This resource use an orchestration template to define and deploy a multi-container application. An application is created by using an orchestration template.
 * Each application can contain one or more services.
 *
 * -> **NOTE:** Application orchestration template must be a valid Docker Compose YAML template.
 *
 * -> **NOTE:** At present, this resource only support swarm cluster.
 */
export declare class Application extends pulumi.CustomResource {
    /**
     * Get an existing Application resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationState): Application;
    /**
     * Wherther to use "Blue Green" method when release a new version. Default to false.
     */
    readonly blueGreen: pulumi.Output<boolean | undefined>;
    /**
     * Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
     */
    readonly blueGreenConfirm: pulumi.Output<boolean | undefined>;
    /**
     * The swarm cluster's name.
     */
    readonly clusterName: pulumi.Output<string>;
    /**
     * The application default domain and it can be used to configure routing service.
     */
    readonly defaultDomain: pulumi.Output<string>;
    /**
     * The description of application.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * A key/value map used to replace the variable parameter in the Compose template.
     */
    readonly environment: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    /**
     * Whether to use latest docker image while each updating application. Default to false.
     */
    readonly latestImage: pulumi.Output<boolean | undefined>;
    /**
     * The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
     */
    readonly name: pulumi.Output<string>;
    /**
     * List of services in the application. It contains several attributes to `Block Nodes`.
     */
    readonly services: pulumi.Output<{
        id: string;
        name: string;
        status: string;
        version: string;
    }[]>;
    /**
     * The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
     */
    readonly template: pulumi.Output<string>;
    /**
     * The application deploying version. Each updating, it must be different with current. Default to "1.0"
     */
    readonly version: pulumi.Output<string | undefined>;
    /**
     * Create a Application resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Application resources.
 */
export interface ApplicationState {
    /**
     * Wherther to use "Blue Green" method when release a new version. Default to false.
     */
    readonly blueGreen?: pulumi.Input<boolean>;
    /**
     * Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
     */
    readonly blueGreenConfirm?: pulumi.Input<boolean>;
    /**
     * The swarm cluster's name.
     */
    readonly clusterName?: pulumi.Input<string>;
    /**
     * The application default domain and it can be used to configure routing service.
     */
    readonly defaultDomain?: pulumi.Input<string>;
    /**
     * The description of application.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A key/value map used to replace the variable parameter in the Compose template.
     */
    readonly environment?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * Whether to use latest docker image while each updating application. Default to false.
     */
    readonly latestImage?: pulumi.Input<boolean>;
    /**
     * The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * List of services in the application. It contains several attributes to `Block Nodes`.
     */
    readonly services?: pulumi.Input<pulumi.Input<{
        id?: pulumi.Input<string>;
        name?: pulumi.Input<string>;
        status?: pulumi.Input<string>;
        version?: pulumi.Input<string>;
    }>[]>;
    /**
     * The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
     */
    readonly template?: pulumi.Input<string>;
    /**
     * The application deploying version. Each updating, it must be different with current. Default to "1.0"
     */
    readonly version?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Application resource.
 */
export interface ApplicationArgs {
    /**
     * Wherther to use "Blue Green" method when release a new version. Default to false.
     */
    readonly blueGreen?: pulumi.Input<boolean>;
    /**
     * Whether to confirm a "Blue Green" application. Default to false. It will be ignored when `blue_green` is false.
     */
    readonly blueGreenConfirm?: pulumi.Input<boolean>;
    /**
     * The swarm cluster's name.
     */
    readonly clusterName: pulumi.Input<string>;
    /**
     * The description of application.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A key/value map used to replace the variable parameter in the Compose template.
     */
    readonly environment?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * Whether to use latest docker image while each updating application. Default to false.
     */
    readonly latestImage?: pulumi.Input<boolean>;
    /**
     * The application name. It should be 1-64 characters long, and can contain numbers, English letters and hyphens, but cannot start with hyphens.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The application deployment template and it must be [Docker Compose format](https://docs.docker.com/compose/).
     */
    readonly template: pulumi.Input<string>;
    /**
     * The application deploying version. Each updating, it must be different with current. Default to "1.0"
     */
    readonly version?: pulumi.Input<string>;
}
