// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AlertArgs, AlertState } from "./alert";
export type Alert = import("./alert").Alert;
export const Alert: typeof import("./alert").Alert = null as any;
utilities.lazyLoad(exports, ["Alert"], () => require("./alert"));

export { AlertResourceArgs, AlertResourceState } from "./alertResource";
export type AlertResource = import("./alertResource").AlertResource;
export const AlertResource: typeof import("./alertResource").AlertResource = null as any;
utilities.lazyLoad(exports, ["AlertResource"], () => require("./alertResource"));

export { AuditArgs, AuditState } from "./audit";
export type Audit = import("./audit").Audit;
export const Audit: typeof import("./audit").Audit = null as any;
utilities.lazyLoad(exports, ["Audit"], () => require("./audit"));

export { DashboardArgs, DashboardState } from "./dashboard";
export type Dashboard = import("./dashboard").Dashboard;
export const Dashboard: typeof import("./dashboard").Dashboard = null as any;
utilities.lazyLoad(exports, ["Dashboard"], () => require("./dashboard"));

export { EtlArgs, EtlState } from "./etl";
export type Etl = import("./etl").Etl;
export const Etl: typeof import("./etl").Etl = null as any;
utilities.lazyLoad(exports, ["Etl"], () => require("./etl"));

export { GetAlertResourceArgs, GetAlertResourceResult, GetAlertResourceOutputArgs } from "./getAlertResource";
export const getAlertResource: typeof import("./getAlertResource").getAlertResource = null as any;
export const getAlertResourceOutput: typeof import("./getAlertResource").getAlertResourceOutput = null as any;
utilities.lazyLoad(exports, ["getAlertResource","getAlertResourceOutput"], () => require("./getAlertResource"));

export { GetProjectsArgs, GetProjectsResult, GetProjectsOutputArgs } from "./getProjects";
export const getProjects: typeof import("./getProjects").getProjects = null as any;
export const getProjectsOutput: typeof import("./getProjects").getProjectsOutput = null as any;
utilities.lazyLoad(exports, ["getProjects","getProjectsOutput"], () => require("./getProjects"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { GetStoresArgs, GetStoresResult, GetStoresOutputArgs } from "./getStores";
export const getStores: typeof import("./getStores").getStores = null as any;
export const getStoresOutput: typeof import("./getStores").getStoresOutput = null as any;
utilities.lazyLoad(exports, ["getStores","getStoresOutput"], () => require("./getStores"));

export { IngestionArgs, IngestionState } from "./ingestion";
export type Ingestion = import("./ingestion").Ingestion;
export const Ingestion: typeof import("./ingestion").Ingestion = null as any;
utilities.lazyLoad(exports, ["Ingestion"], () => require("./ingestion"));

export { LogTailAttachmentArgs, LogTailAttachmentState } from "./logTailAttachment";
export type LogTailAttachment = import("./logTailAttachment").LogTailAttachment;
export const LogTailAttachment: typeof import("./logTailAttachment").LogTailAttachment = null as any;
utilities.lazyLoad(exports, ["LogTailAttachment"], () => require("./logTailAttachment"));

export { LogTailConfigArgs, LogTailConfigState } from "./logTailConfig";
export type LogTailConfig = import("./logTailConfig").LogTailConfig;
export const LogTailConfig: typeof import("./logTailConfig").LogTailConfig = null as any;
utilities.lazyLoad(exports, ["LogTailConfig"], () => require("./logTailConfig"));

export { MachineGroupArgs, MachineGroupState } from "./machineGroup";
export type MachineGroup = import("./machineGroup").MachineGroup;
export const MachineGroup: typeof import("./machineGroup").MachineGroup = null as any;
utilities.lazyLoad(exports, ["MachineGroup"], () => require("./machineGroup"));

export { OssExportArgs, OssExportState } from "./ossExport";
export type OssExport = import("./ossExport").OssExport;
export const OssExport: typeof import("./ossExport").OssExport = null as any;
utilities.lazyLoad(exports, ["OssExport"], () => require("./ossExport"));

export { OssShipperArgs, OssShipperState } from "./ossShipper";
export type OssShipper = import("./ossShipper").OssShipper;
export const OssShipper: typeof import("./ossShipper").OssShipper = null as any;
utilities.lazyLoad(exports, ["OssShipper"], () => require("./ossShipper"));

export { ProjectArgs, ProjectState } from "./project";
export type Project = import("./project").Project;
export const Project: typeof import("./project").Project = null as any;
utilities.lazyLoad(exports, ["Project"], () => require("./project"));

export { ResourceArgs, ResourceState } from "./resource";
export type Resource = import("./resource").Resource;
export const Resource: typeof import("./resource").Resource = null as any;
utilities.lazyLoad(exports, ["Resource"], () => require("./resource"));

export { ResourceRecordArgs, ResourceRecordState } from "./resourceRecord";
export type ResourceRecord = import("./resourceRecord").ResourceRecord;
export const ResourceRecord: typeof import("./resourceRecord").ResourceRecord = null as any;
utilities.lazyLoad(exports, ["ResourceRecord"], () => require("./resourceRecord"));

export { StoreArgs, StoreState } from "./store";
export type Store = import("./store").Store;
export const Store: typeof import("./store").Store = null as any;
utilities.lazyLoad(exports, ["Store"], () => require("./store"));

export { StoreIndexArgs, StoreIndexState } from "./storeIndex";
export type StoreIndex = import("./storeIndex").StoreIndex;
export const StoreIndex: typeof import("./storeIndex").StoreIndex = null as any;
utilities.lazyLoad(exports, ["StoreIndex"], () => require("./storeIndex"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:log/alert:Alert":
                return new Alert(name, <any>undefined, { urn })
            case "alicloud:log/alertResource:AlertResource":
                return new AlertResource(name, <any>undefined, { urn })
            case "alicloud:log/audit:Audit":
                return new Audit(name, <any>undefined, { urn })
            case "alicloud:log/dashboard:Dashboard":
                return new Dashboard(name, <any>undefined, { urn })
            case "alicloud:log/etl:Etl":
                return new Etl(name, <any>undefined, { urn })
            case "alicloud:log/ingestion:Ingestion":
                return new Ingestion(name, <any>undefined, { urn })
            case "alicloud:log/logTailAttachment:LogTailAttachment":
                return new LogTailAttachment(name, <any>undefined, { urn })
            case "alicloud:log/logTailConfig:LogTailConfig":
                return new LogTailConfig(name, <any>undefined, { urn })
            case "alicloud:log/machineGroup:MachineGroup":
                return new MachineGroup(name, <any>undefined, { urn })
            case "alicloud:log/ossExport:OssExport":
                return new OssExport(name, <any>undefined, { urn })
            case "alicloud:log/ossShipper:OssShipper":
                return new OssShipper(name, <any>undefined, { urn })
            case "alicloud:log/project:Project":
                return new Project(name, <any>undefined, { urn })
            case "alicloud:log/resource:Resource":
                return new Resource(name, <any>undefined, { urn })
            case "alicloud:log/resourceRecord:ResourceRecord":
                return new ResourceRecord(name, <any>undefined, { urn })
            case "alicloud:log/store:Store":
                return new Store(name, <any>undefined, { urn })
            case "alicloud:log/storeIndex:StoreIndex":
                return new StoreIndex(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "log/alert", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/alertResource", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/audit", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/dashboard", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/etl", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/ingestion", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/logTailAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/logTailConfig", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/machineGroup", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/ossExport", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/ossShipper", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/project", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/resource", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/resourceRecord", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/store", _module)
pulumi.runtime.registerResourceModule("alicloud", "log/storeIndex", _module)
