// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **DEPRECATED:**  This datasource has been deprecated from version `1.129.0`. Please use new datasource alicloud_ssl_certificates_service_certificates.
 *
 * This data source provides a list of CAS Certificates in an Alibaba Cloud account according to the specified filters.
 */
/** @deprecated This resource has been deprecated in favour of getServiceCertificates */
export function getCertificates(args?: GetCertificatesArgs, opts?: pulumi.InvokeOptions): Promise<GetCertificatesResult> {
    pulumi.log.warn("getCertificates is deprecated: This resource has been deprecated in favour of getServiceCertificates")
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cas/getCertificates:getCertificates", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "keyword": args.keyword,
        "lang": args.lang,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificates.
 */
export interface GetCertificatesArgs {
    enableDetails?: boolean;
    /**
     * A list of cert IDs.
     */
    ids?: string[];
    keyword?: string;
    /**
     * @deprecated Field `lang` has been deprecated from provider version 1.232.0.
     */
    lang?: string;
    /**
     * A regex string to filter results by the certificate name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getCertificates.
 */
export interface GetCertificatesResult {
    /**
     * A list of apis. Each element contains the following attributes:
     */
    readonly certificates: outputs.cas.GetCertificatesCertificate[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of cert IDs.
     */
    readonly ids: string[];
    readonly keyword?: string;
    /**
     * @deprecated Field `lang` has been deprecated from provider version 1.232.0.
     */
    readonly lang?: string;
    readonly nameRegex?: string;
    /**
     * A list of cert names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * > **DEPRECATED:**  This datasource has been deprecated from version `1.129.0`. Please use new datasource alicloud_ssl_certificates_service_certificates.
 *
 * This data source provides a list of CAS Certificates in an Alibaba Cloud account according to the specified filters.
 */
/** @deprecated This resource has been deprecated in favour of getServiceCertificates */
export function getCertificatesOutput(args?: GetCertificatesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCertificatesResult> {
    pulumi.log.warn("getCertificates is deprecated: This resource has been deprecated in favour of getServiceCertificates")
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:cas/getCertificates:getCertificates", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "keyword": args.keyword,
        "lang": args.lang,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getCertificates.
 */
export interface GetCertificatesOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of cert IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    keyword?: pulumi.Input<string>;
    /**
     * @deprecated Field `lang` has been deprecated from provider version 1.232.0.
     */
    lang?: pulumi.Input<string>;
    /**
     * A regex string to filter results by the certificate name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
