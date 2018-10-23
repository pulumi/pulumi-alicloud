import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of DNS Domain Records in an Alibaba Cloud account according to the specified filters.
 */
export declare function getRecords(args: GetRecordsArgs, opts?: pulumi.InvokeOptions): Promise<GetRecordsResult>;
/**
 * A collection of arguments for invoking getRecords.
 */
export interface GetRecordsArgs {
    /**
     * The domain name associated to the records.
     */
    readonly domainName: string;
    /**
     * Host record regex.
     */
    readonly hostRecordRegex?: string;
    /**
     * Whether the record is locked or not.
     */
    readonly isLocked?: boolean;
    /**
     * ISP line. Valid items are `default`, `telecom`, `unicom`, `mobile`, `oversea`, `edu`.
     */
    readonly line?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * Record status. Valid items are `ENABLE` and `DISABLE`.
     */
    readonly status?: string;
    /**
     * Record type. Valid items are `A`, `NS`, `MX`, `TXT`, `CNAME`, `SRV`, `AAAA`, `REDIRECT_URL`, `FORWORD_URL` .
     */
    readonly type?: string;
    /**
     * Host record value regex.
     */
    readonly valueRegex?: string;
}
/**
 * A collection of values returned by getRecords.
 */
export interface GetRecordsResult {
    /**
     * A list of records. Each element contains the following attributes:
     */
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
