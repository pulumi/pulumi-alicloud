import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides information about [router interfaces](https://www.alibabacloud.com/help/doc-detail/52412.htm)
 * that connect VPCs together.
 */
export declare function getRouterInterfaces(args?: GetRouterInterfacesArgs, opts?: pulumi.InvokeOptions): Promise<GetRouterInterfacesResult>;
/**
 * A collection of arguments for invoking getRouterInterfaces.
 */
export interface GetRouterInterfacesArgs {
    /**
     * A regex string used to filter by router interface name.
     */
    readonly nameRegex?: string;
    /**
     * ID of the peer router interface.
     */
    readonly oppositeInterfaceId?: string;
    /**
     * Account ID of the owner of the peer router interface.
     */
    readonly oppositeInterfaceOwnerId?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Role of the router interface. Valid values are `InitiatingSide` (connection initiator) and
     * `AcceptingSide` (connection receiver). The value of this parameter must be `InitiatingSide` if the `router_type` is set to `VBR`.
     */
    readonly role?: string;
    /**
     * ID of the VRouter located in the local region.
     */
    readonly routerId?: string;
    /**
     * Router type in the local region. Valid values are `VRouter` and `VBR` (physical connection).
     */
    readonly routerType?: string;
    /**
     * Specification of the link, such as `Small.1` (10Mb), `Middle.1` (100Mb), `Large.2` (2Gb), ...etc.
     */
    readonly specification?: string;
    /**
     * Expected status. Valid values are `Active`, `Inactive` and `Idle`.
     */
    readonly status?: string;
}
/**
 * A collection of values returned by getRouterInterfaces.
 */
export interface GetRouterInterfacesResult {
    /**
     * A list of router interfaces. Each element contains the following attributes:
     */
    readonly interfaces: {
        accessPointId: string;
        creationTime: string;
        description: string;
        healthCheckSourceIp: string;
        healthCheckTargetIp: string;
        id: string;
        name: string;
        oppositeInterfaceId: string;
        oppositeInterfaceOwnerId: string;
        oppositeRegionId: string;
        oppositeRouterId: string;
        oppositeRouterType: string;
        role: string;
        routerId: string;
        routerType: string;
        specification: string;
        status: string;
        vpcId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
