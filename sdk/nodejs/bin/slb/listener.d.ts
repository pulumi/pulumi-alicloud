import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an Application Load Balancer Listener resource.
 *
 * For information about slb and how to use it, see [What is Server Load Balancer](https://www.alibabacloud.com/help/doc-detail/27539.htm).
 *
 * For information about listener and how to use it, see [Configure a Listener](https://www.alibabacloud.com/help/doc-detail/27594.htm).
 *
 */
export declare class Listener extends pulumi.CustomResource {
    /**
     * Get an existing Listener resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ListenerState): Listener;
    /**
     * the id of access control list to be apply on the listener, is the id of resource alicloud_slb_acl. If `acl_status` is "on", it is mandatory. Otherwise, it will be ignored.
     */
    readonly aclId: pulumi.Output<string | undefined>;
    /**
     * Whether to enable "acl(access control list)", the acl is specified by `acl_id`. Valid values are `on` and `off`. Default to `off`.
     */
    readonly aclStatus: pulumi.Output<string | undefined>;
    /**
     * Mode for handling the acl specified by acl_id. If `acl_status` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `white` and `black`. `white` means the Listener can only be accessed by client ip belongs to the acl; `black` means the Listener can not be accessed by client ip belongs to the acl;
     */
    readonly aclType: pulumi.Output<string | undefined>;
    /**
     * Port used by the Server Load Balancer instance backend. Valid value range: [1-65535].
     */
    readonly backendPort: pulumi.Output<number>;
    /**
     * Bandwidth peak of Listener. For the public network instance charged per traffic consumed, the Bandwidth on Listener can be set to -1, indicating the bandwidth peak is unlimited. Valid values are [-1, 1-1000] in Mbps.
     */
    readonly bandwidth: pulumi.Output<number>;
    /**
     * The cookie configured on the server. It is mandatory when `sticky_session` is "on" and `sticky_session_type` is "server". Otherwise, it will be ignored. Valid value：String in line with RFC 2965, with length being 1- 200. It only contains characters such as ASCII codes, English letters and digits instead of the comma, semicolon or spacing, and it cannot start with $.
     */
    readonly cookie: pulumi.Output<string | undefined>;
    /**
     * Cookie timeout. It is mandatory when `sticky_session` is "on" and `sticky_session_type` is "insert". Otherwise, it will be ignored. Valid value range: [1-86400] in seconds.
     */
    readonly cookieTimeout: pulumi.Output<number | undefined>;
    /**
     * Port used by the Server Load Balancer instance frontend. Valid value range: [1-65535].
     */
    readonly frontendPort: pulumi.Output<number>;
    /**
     * Whether to enable "Gzip Compression". If enabled, files of specific file types will be compressed, otherwise, no files will be compressed. Default to true. Available in v1.13.0+.
     */
    readonly gzip: pulumi.Output<boolean | undefined>;
    /**
     * Whether to enable health check. Valid values are`on` and `off`. TCP and UDP listener's HealthCheck is always on, so it will be ignore when launching TCP or UDP listener.
     */
    readonly healthCheck: pulumi.Output<string | undefined>;
    /**
     * Port used for health check. Valid value range: [1-65535]. Default to "None" means the backend server port is used.
     */
    readonly healthCheckConnectPort: pulumi.Output<number>;
    /**
     * Domain name used for health check. When it used to launch TCP listener, `health_check_type` must be "http". Its length is limited to 1-80 and only characters such as letters, digits, ‘-‘ and ‘.’ are allowed. When it is not set or empty,  Server Load Balancer uses the private network IP address of each backend server as Domain used for health check.
     */
    readonly healthCheckDomain: pulumi.Output<string | undefined>;
    /**
     * Regular health check HTTP status code. Multiple codes are segmented by “,”. It is required when `health_check` is on. Default to `http_2xx`.  Valid values are: `http_2xx`,  `http_3xx`, `http_4xx` and `http_5xx`.
     */
    readonly healthCheckHttpCode: pulumi.Output<string | undefined>;
    /**
     * Time interval of health checks. It is required when `health_check` is on. Valid value range: [1-50] in seconds. Default to 2.
     */
    readonly healthCheckInterval: pulumi.Output<number | undefined>;
    /**
     * Maximum timeout of each health check response. It is required when `health_check` is on. Valid value range: [1-300] in seconds. Default to 5. Note: If `health_check_timeout` < `health_check_interval`, its will be replaced by `health_check_interval`.
     */
    readonly healthCheckTimeout: pulumi.Output<number | undefined>;
    /**
     * Type of health check. Valid values are: `tcp` and `http`. Default to `tcp` . TCP supports TCP and HTTP health check mode, you can select the particular mode depending on your application.
     */
    readonly healthCheckType: pulumi.Output<string | undefined>;
    /**
     * URI used for health check. When it used to launch TCP listener, `health_check_type` must be "http". Its length is limited to 1-80 and it must start with /. Only characters such as letters, digits, ‘-’, ‘/’, ‘.’, ‘%’, ‘?’, #’ and ‘&’ are allowed.
     */
    readonly healthCheckUri: pulumi.Output<string | undefined>;
    /**
     * Threshold determining the result of the health check is success. It is required when `health_check` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    readonly healthyThreshold: pulumi.Output<number | undefined>;
    readonly instancePort: pulumi.Output<number | undefined>;
    readonly lbPort: pulumi.Output<number | undefined>;
    readonly lbProtocol: pulumi.Output<string | undefined>;
    /**
     * The Load Balancer ID which is used to launch a new listener.
     */
    readonly loadBalancerId: pulumi.Output<string>;
    /**
     * Timeout of connection persistence. Valid value range: [0-3600] in seconds. Default to 0 and means closing it.
     */
    readonly persistenceTimeout: pulumi.Output<number | undefined>;
    /**
     * The protocol to listen on. Valid values are [`http`, `https`, `tcp`, `udp`].
     */
    readonly protocol: pulumi.Output<string>;
    /**
     * Scheduling algorithm, Valid values are `wrr` and `wlc`.  Default to "wrr".
     */
    readonly scheduler: pulumi.Output<string | undefined>;
    readonly serverGroupId: pulumi.Output<string | undefined>;
    /**
     * Security certificate ID. It is required when `protocol` is `https`.
     */
    readonly sslCertificateId: pulumi.Output<string | undefined>;
    /**
     * Whether to enable session persistence, Valid values are `on` and `off`. Default to `off`.
     */
    readonly stickySession: pulumi.Output<string | undefined>;
    /**
     * Mode for handling the cookie. If `sticky_session` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `insert` and `server`. `insert` means it is inserted from Server Load Balancer; `server` means the Server Load Balancer learns from the backend server.
     */
    readonly stickySessionType: pulumi.Output<string | undefined>;
    /**
     * Threshold determining the result of the health check is fail. It is required when `health_check` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    readonly unhealthyThreshold: pulumi.Output<number | undefined>;
    /**
     * Whether to set additional HTTP Header field "X-Forwarded-For" (documented below). Available in v1.13.0+.
     */
    readonly xForwardedFor: pulumi.Output<{
        retriveClientIp: boolean;
        retriveSlbId?: boolean;
        retriveSlbIp?: boolean;
        retriveSlbProto?: boolean;
    }>;
    /**
     * Create a Listener resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ListenerArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Listener resources.
 */
export interface ListenerState {
    /**
     * the id of access control list to be apply on the listener, is the id of resource alicloud_slb_acl. If `acl_status` is "on", it is mandatory. Otherwise, it will be ignored.
     */
    readonly aclId?: pulumi.Input<string>;
    /**
     * Whether to enable "acl(access control list)", the acl is specified by `acl_id`. Valid values are `on` and `off`. Default to `off`.
     */
    readonly aclStatus?: pulumi.Input<string>;
    /**
     * Mode for handling the acl specified by acl_id. If `acl_status` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `white` and `black`. `white` means the Listener can only be accessed by client ip belongs to the acl; `black` means the Listener can not be accessed by client ip belongs to the acl;
     */
    readonly aclType?: pulumi.Input<string>;
    /**
     * Port used by the Server Load Balancer instance backend. Valid value range: [1-65535].
     */
    readonly backendPort?: pulumi.Input<number>;
    /**
     * Bandwidth peak of Listener. For the public network instance charged per traffic consumed, the Bandwidth on Listener can be set to -1, indicating the bandwidth peak is unlimited. Valid values are [-1, 1-1000] in Mbps.
     */
    readonly bandwidth?: pulumi.Input<number>;
    /**
     * The cookie configured on the server. It is mandatory when `sticky_session` is "on" and `sticky_session_type` is "server". Otherwise, it will be ignored. Valid value：String in line with RFC 2965, with length being 1- 200. It only contains characters such as ASCII codes, English letters and digits instead of the comma, semicolon or spacing, and it cannot start with $.
     */
    readonly cookie?: pulumi.Input<string>;
    /**
     * Cookie timeout. It is mandatory when `sticky_session` is "on" and `sticky_session_type` is "insert". Otherwise, it will be ignored. Valid value range: [1-86400] in seconds.
     */
    readonly cookieTimeout?: pulumi.Input<number>;
    /**
     * Port used by the Server Load Balancer instance frontend. Valid value range: [1-65535].
     */
    readonly frontendPort?: pulumi.Input<number>;
    /**
     * Whether to enable "Gzip Compression". If enabled, files of specific file types will be compressed, otherwise, no files will be compressed. Default to true. Available in v1.13.0+.
     */
    readonly gzip?: pulumi.Input<boolean>;
    /**
     * Whether to enable health check. Valid values are`on` and `off`. TCP and UDP listener's HealthCheck is always on, so it will be ignore when launching TCP or UDP listener.
     */
    readonly healthCheck?: pulumi.Input<string>;
    /**
     * Port used for health check. Valid value range: [1-65535]. Default to "None" means the backend server port is used.
     */
    readonly healthCheckConnectPort?: pulumi.Input<number>;
    /**
     * Domain name used for health check. When it used to launch TCP listener, `health_check_type` must be "http". Its length is limited to 1-80 and only characters such as letters, digits, ‘-‘ and ‘.’ are allowed. When it is not set or empty,  Server Load Balancer uses the private network IP address of each backend server as Domain used for health check.
     */
    readonly healthCheckDomain?: pulumi.Input<string>;
    /**
     * Regular health check HTTP status code. Multiple codes are segmented by “,”. It is required when `health_check` is on. Default to `http_2xx`.  Valid values are: `http_2xx`,  `http_3xx`, `http_4xx` and `http_5xx`.
     */
    readonly healthCheckHttpCode?: pulumi.Input<string>;
    /**
     * Time interval of health checks. It is required when `health_check` is on. Valid value range: [1-50] in seconds. Default to 2.
     */
    readonly healthCheckInterval?: pulumi.Input<number>;
    /**
     * Maximum timeout of each health check response. It is required when `health_check` is on. Valid value range: [1-300] in seconds. Default to 5. Note: If `health_check_timeout` < `health_check_interval`, its will be replaced by `health_check_interval`.
     */
    readonly healthCheckTimeout?: pulumi.Input<number>;
    /**
     * Type of health check. Valid values are: `tcp` and `http`. Default to `tcp` . TCP supports TCP and HTTP health check mode, you can select the particular mode depending on your application.
     */
    readonly healthCheckType?: pulumi.Input<string>;
    /**
     * URI used for health check. When it used to launch TCP listener, `health_check_type` must be "http". Its length is limited to 1-80 and it must start with /. Only characters such as letters, digits, ‘-’, ‘/’, ‘.’, ‘%’, ‘?’, #’ and ‘&’ are allowed.
     */
    readonly healthCheckUri?: pulumi.Input<string>;
    /**
     * Threshold determining the result of the health check is success. It is required when `health_check` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    readonly healthyThreshold?: pulumi.Input<number>;
    readonly instancePort?: pulumi.Input<number>;
    readonly lbPort?: pulumi.Input<number>;
    readonly lbProtocol?: pulumi.Input<string>;
    /**
     * The Load Balancer ID which is used to launch a new listener.
     */
    readonly loadBalancerId?: pulumi.Input<string>;
    /**
     * Timeout of connection persistence. Valid value range: [0-3600] in seconds. Default to 0 and means closing it.
     */
    readonly persistenceTimeout?: pulumi.Input<number>;
    /**
     * The protocol to listen on. Valid values are [`http`, `https`, `tcp`, `udp`].
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * Scheduling algorithm, Valid values are `wrr` and `wlc`.  Default to "wrr".
     */
    readonly scheduler?: pulumi.Input<string>;
    readonly serverGroupId?: pulumi.Input<string>;
    /**
     * Security certificate ID. It is required when `protocol` is `https`.
     */
    readonly sslCertificateId?: pulumi.Input<string>;
    /**
     * Whether to enable session persistence, Valid values are `on` and `off`. Default to `off`.
     */
    readonly stickySession?: pulumi.Input<string>;
    /**
     * Mode for handling the cookie. If `sticky_session` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `insert` and `server`. `insert` means it is inserted from Server Load Balancer; `server` means the Server Load Balancer learns from the backend server.
     */
    readonly stickySessionType?: pulumi.Input<string>;
    /**
     * Threshold determining the result of the health check is fail. It is required when `health_check` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    readonly unhealthyThreshold?: pulumi.Input<number>;
    /**
     * Whether to set additional HTTP Header field "X-Forwarded-For" (documented below). Available in v1.13.0+.
     */
    readonly xForwardedFor?: pulumi.Input<{
        retriveClientIp?: pulumi.Input<boolean>;
        retriveSlbId?: pulumi.Input<boolean>;
        retriveSlbIp?: pulumi.Input<boolean>;
        retriveSlbProto?: pulumi.Input<boolean>;
    }>;
}
/**
 * The set of arguments for constructing a Listener resource.
 */
export interface ListenerArgs {
    /**
     * the id of access control list to be apply on the listener, is the id of resource alicloud_slb_acl. If `acl_status` is "on", it is mandatory. Otherwise, it will be ignored.
     */
    readonly aclId?: pulumi.Input<string>;
    /**
     * Whether to enable "acl(access control list)", the acl is specified by `acl_id`. Valid values are `on` and `off`. Default to `off`.
     */
    readonly aclStatus?: pulumi.Input<string>;
    /**
     * Mode for handling the acl specified by acl_id. If `acl_status` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `white` and `black`. `white` means the Listener can only be accessed by client ip belongs to the acl; `black` means the Listener can not be accessed by client ip belongs to the acl;
     */
    readonly aclType?: pulumi.Input<string>;
    /**
     * Port used by the Server Load Balancer instance backend. Valid value range: [1-65535].
     */
    readonly backendPort: pulumi.Input<number>;
    /**
     * Bandwidth peak of Listener. For the public network instance charged per traffic consumed, the Bandwidth on Listener can be set to -1, indicating the bandwidth peak is unlimited. Valid values are [-1, 1-1000] in Mbps.
     */
    readonly bandwidth: pulumi.Input<number>;
    /**
     * The cookie configured on the server. It is mandatory when `sticky_session` is "on" and `sticky_session_type` is "server". Otherwise, it will be ignored. Valid value：String in line with RFC 2965, with length being 1- 200. It only contains characters such as ASCII codes, English letters and digits instead of the comma, semicolon or spacing, and it cannot start with $.
     */
    readonly cookie?: pulumi.Input<string>;
    /**
     * Cookie timeout. It is mandatory when `sticky_session` is "on" and `sticky_session_type` is "insert". Otherwise, it will be ignored. Valid value range: [1-86400] in seconds.
     */
    readonly cookieTimeout?: pulumi.Input<number>;
    /**
     * Port used by the Server Load Balancer instance frontend. Valid value range: [1-65535].
     */
    readonly frontendPort: pulumi.Input<number>;
    /**
     * Whether to enable "Gzip Compression". If enabled, files of specific file types will be compressed, otherwise, no files will be compressed. Default to true. Available in v1.13.0+.
     */
    readonly gzip?: pulumi.Input<boolean>;
    /**
     * Whether to enable health check. Valid values are`on` and `off`. TCP and UDP listener's HealthCheck is always on, so it will be ignore when launching TCP or UDP listener.
     */
    readonly healthCheck?: pulumi.Input<string>;
    /**
     * Port used for health check. Valid value range: [1-65535]. Default to "None" means the backend server port is used.
     */
    readonly healthCheckConnectPort?: pulumi.Input<number>;
    /**
     * Domain name used for health check. When it used to launch TCP listener, `health_check_type` must be "http". Its length is limited to 1-80 and only characters such as letters, digits, ‘-‘ and ‘.’ are allowed. When it is not set or empty,  Server Load Balancer uses the private network IP address of each backend server as Domain used for health check.
     */
    readonly healthCheckDomain?: pulumi.Input<string>;
    /**
     * Regular health check HTTP status code. Multiple codes are segmented by “,”. It is required when `health_check` is on. Default to `http_2xx`.  Valid values are: `http_2xx`,  `http_3xx`, `http_4xx` and `http_5xx`.
     */
    readonly healthCheckHttpCode?: pulumi.Input<string>;
    /**
     * Time interval of health checks. It is required when `health_check` is on. Valid value range: [1-50] in seconds. Default to 2.
     */
    readonly healthCheckInterval?: pulumi.Input<number>;
    /**
     * Maximum timeout of each health check response. It is required when `health_check` is on. Valid value range: [1-300] in seconds. Default to 5. Note: If `health_check_timeout` < `health_check_interval`, its will be replaced by `health_check_interval`.
     */
    readonly healthCheckTimeout?: pulumi.Input<number>;
    /**
     * Type of health check. Valid values are: `tcp` and `http`. Default to `tcp` . TCP supports TCP and HTTP health check mode, you can select the particular mode depending on your application.
     */
    readonly healthCheckType?: pulumi.Input<string>;
    /**
     * URI used for health check. When it used to launch TCP listener, `health_check_type` must be "http". Its length is limited to 1-80 and it must start with /. Only characters such as letters, digits, ‘-’, ‘/’, ‘.’, ‘%’, ‘?’, #’ and ‘&’ are allowed.
     */
    readonly healthCheckUri?: pulumi.Input<string>;
    /**
     * Threshold determining the result of the health check is success. It is required when `health_check` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    readonly healthyThreshold?: pulumi.Input<number>;
    readonly instancePort?: pulumi.Input<number>;
    readonly lbPort?: pulumi.Input<number>;
    readonly lbProtocol?: pulumi.Input<string>;
    /**
     * The Load Balancer ID which is used to launch a new listener.
     */
    readonly loadBalancerId: pulumi.Input<string>;
    /**
     * Timeout of connection persistence. Valid value range: [0-3600] in seconds. Default to 0 and means closing it.
     */
    readonly persistenceTimeout?: pulumi.Input<number>;
    /**
     * The protocol to listen on. Valid values are [`http`, `https`, `tcp`, `udp`].
     */
    readonly protocol: pulumi.Input<string>;
    /**
     * Scheduling algorithm, Valid values are `wrr` and `wlc`.  Default to "wrr".
     */
    readonly scheduler?: pulumi.Input<string>;
    readonly serverGroupId?: pulumi.Input<string>;
    /**
     * Security certificate ID. It is required when `protocol` is `https`.
     */
    readonly sslCertificateId?: pulumi.Input<string>;
    /**
     * Whether to enable session persistence, Valid values are `on` and `off`. Default to `off`.
     */
    readonly stickySession?: pulumi.Input<string>;
    /**
     * Mode for handling the cookie. If `sticky_session` is "on", it is mandatory. Otherwise, it will be ignored. Valid values are `insert` and `server`. `insert` means it is inserted from Server Load Balancer; `server` means the Server Load Balancer learns from the backend server.
     */
    readonly stickySessionType?: pulumi.Input<string>;
    /**
     * Threshold determining the result of the health check is fail. It is required when `health_check` is on. Valid value range: [1-10] in seconds. Default to 3.
     */
    readonly unhealthyThreshold?: pulumi.Input<number>;
    /**
     * Whether to set additional HTTP Header field "X-Forwarded-For" (documented below). Available in v1.13.0+.
     */
    readonly xForwardedFor?: pulumi.Input<{
        retriveClientIp?: pulumi.Input<boolean>;
        retriveSlbId?: pulumi.Input<boolean>;
        retriveSlbIp?: pulumi.Input<boolean>;
        retriveSlbProto?: pulumi.Input<boolean>;
    }>;
}
