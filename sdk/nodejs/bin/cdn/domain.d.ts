import * as pulumi from "@pulumi/pulumi";
/**
 * Provides a CDN Accelerated Domain resource.
 */
export declare class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState): Domain;
    /**
     * Auth config of the accelerated domain. It's a set and consist of at most 1 item.
     */
    readonly authConfig: pulumi.Output<{
        authType?: string;
        masterKey: string;
        slaveKey: string;
        timeout?: number;
    } | undefined>;
    readonly blockIps: pulumi.Output<string[] | undefined>;
    /**
     * Cache config of the accelerated domain. It's a set and each item's `cache_content` can not be repeated.
     */
    readonly cacheConfigs: pulumi.Output<{
        cacheContent: string;
        cacheId: string;
        cacheType: string;
        ttl: number;
        weight?: number;
    }[] | undefined>;
    /**
     * Cdn type of the accelerated domain. Valid values are `web`, `download`, `video`, `liveStream`.
     */
    readonly cdnType: pulumi.Output<string>;
    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    readonly domainName: pulumi.Output<string>;
    /**
     * Http header config of the accelerated domain. It's a set and consist of at most 8 items. The `header_key` for each item can not be repeated.
     */
    readonly httpHeaderConfigs: pulumi.Output<{
        headerId: string;
        headerKey: string;
        headerValue: string;
    }[] | undefined>;
    /**
     * Page Optimize config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`. It can effectively remove the page redundant content, reduce the file size and improve the speed of distribution when this parameter value is `on`.
     */
    readonly optimizeEnable: pulumi.Output<string | undefined>;
    /**
     * Error Page config of the accelerated domain. It's a set and consists of at most one item.
     */
    readonly page404Config: pulumi.Output<{
        customPageUrl?: string;
        errorCode: string;
        pageType?: string;
    } | undefined>;
    /**
     * Page Compress config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly pageCompressEnable: pulumi.Output<string | undefined>;
    /**
     * Parameter filter config of the accelerated domain. It's a set and consists of at most one item.
     */
    readonly parameterFilterConfig: pulumi.Output<{
        enable?: string;
        hashKeyArgs: string[];
    } | undefined>;
    /**
     * Range Source config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly rangeEnable: pulumi.Output<string | undefined>;
    /**
     * Refer anti-theft chain config of the accelerated domain. It's a set and consists of at most 1 item.
     */
    readonly referConfig: pulumi.Output<{
        allowEmpty?: string;
        referLists: string[];
        referType?: string;
    } | undefined>;
    /**
     * Scope of the accelerated domain. Valid values are `domestic`, `overseas`, `global`. Default value is `domestic`. This parameter's setting is valid Only for the international users and domestic L3 and above users .
     */
    readonly scope: pulumi.Output<string>;
    /**
     * Source port of the accelerated domain. Valid values are `80` and `443`. Default value is `80`. You must use `80` when the `source_type` is `oss`.
     */
    readonly sourcePort: pulumi.Output<number | undefined>;
    /**
     * Source type of the accelerated domain. Valid values are `ipaddr`, `domain`, `oss`. You must set this parameter when `cdn_type` value is not `liveStream`.
     */
    readonly sourceType: pulumi.Output<string | undefined>;
    /**
     * Sources of the accelerated domain. It's a list of domain names or IP address and consists of at most 20 items. You must set this parameter when `cdn_type` value is not `liveStream`.
     */
    readonly sources: pulumi.Output<string[] | undefined>;
    /**
     * Video Seek config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly videoSeekEnable: pulumi.Output<string | undefined>;
    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * Auth config of the accelerated domain. It's a set and consist of at most 1 item.
     */
    readonly authConfig?: pulumi.Input<{
        authType?: pulumi.Input<string>;
        masterKey?: pulumi.Input<string>;
        slaveKey?: pulumi.Input<string>;
        timeout?: pulumi.Input<number>;
    }>;
    readonly blockIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Cache config of the accelerated domain. It's a set and each item's `cache_content` can not be repeated.
     */
    readonly cacheConfigs?: pulumi.Input<pulumi.Input<{
        cacheContent: pulumi.Input<string>;
        cacheId?: pulumi.Input<string>;
        cacheType: pulumi.Input<string>;
        ttl: pulumi.Input<number>;
        weight?: pulumi.Input<number>;
    }>[]>;
    /**
     * Cdn type of the accelerated domain. Valid values are `web`, `download`, `video`, `liveStream`.
     */
    readonly cdnType?: pulumi.Input<string>;
    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    readonly domainName?: pulumi.Input<string>;
    /**
     * Http header config of the accelerated domain. It's a set and consist of at most 8 items. The `header_key` for each item can not be repeated.
     */
    readonly httpHeaderConfigs?: pulumi.Input<pulumi.Input<{
        headerId?: pulumi.Input<string>;
        headerKey: pulumi.Input<string>;
        headerValue: pulumi.Input<string>;
    }>[]>;
    /**
     * Page Optimize config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`. It can effectively remove the page redundant content, reduce the file size and improve the speed of distribution when this parameter value is `on`.
     */
    readonly optimizeEnable?: pulumi.Input<string>;
    /**
     * Error Page config of the accelerated domain. It's a set and consists of at most one item.
     */
    readonly page404Config?: pulumi.Input<{
        customPageUrl?: pulumi.Input<string>;
        errorCode?: pulumi.Input<string>;
        pageType?: pulumi.Input<string>;
    }>;
    /**
     * Page Compress config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly pageCompressEnable?: pulumi.Input<string>;
    /**
     * Parameter filter config of the accelerated domain. It's a set and consists of at most one item.
     */
    readonly parameterFilterConfig?: pulumi.Input<{
        enable?: pulumi.Input<string>;
        hashKeyArgs?: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    /**
     * Range Source config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly rangeEnable?: pulumi.Input<string>;
    /**
     * Refer anti-theft chain config of the accelerated domain. It's a set and consists of at most 1 item.
     */
    readonly referConfig?: pulumi.Input<{
        allowEmpty?: pulumi.Input<string>;
        referLists: pulumi.Input<pulumi.Input<string>[]>;
        referType?: pulumi.Input<string>;
    }>;
    /**
     * Scope of the accelerated domain. Valid values are `domestic`, `overseas`, `global`. Default value is `domestic`. This parameter's setting is valid Only for the international users and domestic L3 and above users .
     */
    readonly scope?: pulumi.Input<string>;
    /**
     * Source port of the accelerated domain. Valid values are `80` and `443`. Default value is `80`. You must use `80` when the `source_type` is `oss`.
     */
    readonly sourcePort?: pulumi.Input<number>;
    /**
     * Source type of the accelerated domain. Valid values are `ipaddr`, `domain`, `oss`. You must set this parameter when `cdn_type` value is not `liveStream`.
     */
    readonly sourceType?: pulumi.Input<string>;
    /**
     * Sources of the accelerated domain. It's a list of domain names or IP address and consists of at most 20 items. You must set this parameter when `cdn_type` value is not `liveStream`.
     */
    readonly sources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Video Seek config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly videoSeekEnable?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * Auth config of the accelerated domain. It's a set and consist of at most 1 item.
     */
    readonly authConfig?: pulumi.Input<{
        authType?: pulumi.Input<string>;
        masterKey?: pulumi.Input<string>;
        slaveKey?: pulumi.Input<string>;
        timeout?: pulumi.Input<number>;
    }>;
    readonly blockIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Cache config of the accelerated domain. It's a set and each item's `cache_content` can not be repeated.
     */
    readonly cacheConfigs?: pulumi.Input<pulumi.Input<{
        cacheContent: pulumi.Input<string>;
        cacheId?: pulumi.Input<string>;
        cacheType: pulumi.Input<string>;
        ttl: pulumi.Input<number>;
        weight?: pulumi.Input<number>;
    }>[]>;
    /**
     * Cdn type of the accelerated domain. Valid values are `web`, `download`, `video`, `liveStream`.
     */
    readonly cdnType: pulumi.Input<string>;
    /**
     * Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    readonly domainName: pulumi.Input<string>;
    /**
     * Http header config of the accelerated domain. It's a set and consist of at most 8 items. The `header_key` for each item can not be repeated.
     */
    readonly httpHeaderConfigs?: pulumi.Input<pulumi.Input<{
        headerId?: pulumi.Input<string>;
        headerKey: pulumi.Input<string>;
        headerValue: pulumi.Input<string>;
    }>[]>;
    /**
     * Page Optimize config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`. It can effectively remove the page redundant content, reduce the file size and improve the speed of distribution when this parameter value is `on`.
     */
    readonly optimizeEnable?: pulumi.Input<string>;
    /**
     * Error Page config of the accelerated domain. It's a set and consists of at most one item.
     */
    readonly page404Config?: pulumi.Input<{
        customPageUrl?: pulumi.Input<string>;
        errorCode?: pulumi.Input<string>;
        pageType?: pulumi.Input<string>;
    }>;
    /**
     * Page Compress config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly pageCompressEnable?: pulumi.Input<string>;
    /**
     * Parameter filter config of the accelerated domain. It's a set and consists of at most one item.
     */
    readonly parameterFilterConfig?: pulumi.Input<{
        enable?: pulumi.Input<string>;
        hashKeyArgs?: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    /**
     * Range Source config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly rangeEnable?: pulumi.Input<string>;
    /**
     * Refer anti-theft chain config of the accelerated domain. It's a set and consists of at most 1 item.
     */
    readonly referConfig?: pulumi.Input<{
        allowEmpty?: pulumi.Input<string>;
        referLists: pulumi.Input<pulumi.Input<string>[]>;
        referType?: pulumi.Input<string>;
    }>;
    /**
     * Scope of the accelerated domain. Valid values are `domestic`, `overseas`, `global`. Default value is `domestic`. This parameter's setting is valid Only for the international users and domestic L3 and above users .
     */
    readonly scope?: pulumi.Input<string>;
    /**
     * Source port of the accelerated domain. Valid values are `80` and `443`. Default value is `80`. You must use `80` when the `source_type` is `oss`.
     */
    readonly sourcePort?: pulumi.Input<number>;
    /**
     * Source type of the accelerated domain. Valid values are `ipaddr`, `domain`, `oss`. You must set this parameter when `cdn_type` value is not `liveStream`.
     */
    readonly sourceType?: pulumi.Input<string>;
    /**
     * Sources of the accelerated domain. It's a list of domain names or IP address and consists of at most 20 items. You must set this parameter when `cdn_type` value is not `liveStream`.
     */
    readonly sources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Video Seek config of the accelerated domain. Valid values are `on` and `off`. Default value is `off`.
     */
    readonly videoSeekEnable?: pulumi.Input<string>;
}
