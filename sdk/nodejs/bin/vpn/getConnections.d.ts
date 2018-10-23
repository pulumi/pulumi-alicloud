import * as pulumi from "@pulumi/pulumi";
/**
 * The VPN connections data source lists lots of VPN connections resource information owned by an Alicloud account.
 */
export declare function getConnections(args?: GetConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionsResult>;
/**
 * A collection of arguments for invoking getConnections.
 */
export interface GetConnectionsArgs {
    /**
     * Use the VPN customer gateway ID as the search key.
     */
    readonly customerGatewayId?: string;
    /**
     * IDs of the VPN connections.
     */
    readonly ids?: string[];
    /**
     * A regex string of VPN connection name.
     */
    readonly nameRegex?: string;
    /**
     * Save the result to the file.
     */
    readonly outputFile?: string;
    /**
     * Use the VPN gateway ID as the search key.
     */
    readonly vpnGatewayId?: string;
}
/**
 * A collection of values returned by getConnections.
 */
export interface GetConnectionsResult {
    /**
     * A list of VPN connections. Each element contains the following attributes:
     */
    readonly connections: {
        createTime: number;
        customerGatewayId: string;
        effectImmediately: boolean;
        id: string;
        ikeConfigs?: {
            ikeAuthAlg?: string;
            ikeEncAlg?: string;
            ikeLifetime?: number;
            ikeLocalId?: string;
            ikeMode?: string;
            ikePfs?: string;
            ikeRemoteId?: string;
            ikeVersion?: string;
            psk?: string;
        }[];
        ipsecConfigs?: {
            ipsecAuthAlg?: string;
            ipsecEncAlg?: string;
            ipsecLifetime?: number;
            ipsecPfs?: string;
        }[];
        localSubnet: string;
        name: string;
        remoteSubnet: string;
        status: string;
        vpnGatewayId: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
