import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the listeners related to a server load balancer of the current Alibaba Cloud user.
 */
export declare function getListeners(args: GetListenersArgs, opts?: pulumi.InvokeOptions): Promise<GetListenersResult>;
/**
 * A collection of arguments for invoking getListeners.
 */
export interface GetListenersArgs {
    /**
     * Filter listeners by the specified frontend port.
     */
    readonly frontendPort?: number;
    /**
     * ID of the SLB with listeners.
     */
    readonly loadBalancerId: string;
    /**
     * Filter listeners by the specified protocol. Valid values: `http`, `https`, `tcp` and `udp`.
     */
    readonly protocol?: string;
}
/**
 * A collection of values returned by getListeners.
 */
export interface GetListenersResult {
    /**
     * A list of SLB listeners. Each element contains the following attributes:
     */
    readonly slbListeners: {
        backendPort: number;
        bandwidth: number;
        caCertificateId: string;
        cookie: string;
        cookieTimeout: number;
        establishedTimeout: number;
        frontendPort: number;
        gzip: string;
        healthCheck: string;
        healthCheckConnectPort: number;
        healthCheckConnectTimeout: number;
        healthCheckDomain: string;
        healthCheckHttpCode: string;
        healthCheckInterval: number;
        healthCheckTimeout: number;
        healthCheckType: string;
        healthCheckUri: string;
        healthyThreshold: number;
        masterSlaveServerGroupId: string;
        persistenceTimeout: number;
        protocol: string;
        scheduler: string;
        securityStatus: string;
        serverGroupId: string;
        sslCertificateId: string;
        status: string;
        stickySession: string;
        stickySessionType: string;
        unhealthyThreshold: number;
        xForwardedFor: string;
        xForwardedForSlbId: string;
        xForwardedForSlbIp: string;
        xForwardedForSlbProto: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
