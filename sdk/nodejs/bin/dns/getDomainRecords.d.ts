import * as pulumi from "@pulumi/pulumi";
/**
 * ~> **NOTE:** This resource has been deprecated from [v1.3.2](https://github.com/alibaba/terraform-provider/releases/tag/V1.3.2). Please use the datasource `alicloud_dns_records` instead.
 */
export declare function getDomainRecords(args: GetDomainRecordsArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainRecordsResult>;
/**
 * A collection of arguments for invoking getDomainRecords.
 */
export interface GetDomainRecordsArgs {
    readonly domainName: string;
    readonly hostRecordRegex?: string;
    readonly isLocked?: boolean;
    readonly line?: string;
    readonly outputFile?: string;
    readonly status?: string;
    readonly type?: string;
    readonly valueRegex?: string;
}
/**
 * A collection of values returned by getDomainRecords.
 */
export interface GetDomainRecordsResult {
    readonly records: {
        domainName: string;
        hostRecord: string;
        line: string;
        locked: boolean;
        priority: number;
        recordId: string;
        status: string;
        ttl: number;
        type: string;
        value: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
