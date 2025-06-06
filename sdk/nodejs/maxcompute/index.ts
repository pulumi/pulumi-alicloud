// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { GetProjectsArgs, GetProjectsResult, GetProjectsOutputArgs } from "./getProjects";
export const getProjects: typeof import("./getProjects").getProjects = null as any;
export const getProjectsOutput: typeof import("./getProjects").getProjectsOutput = null as any;
utilities.lazyLoad(exports, ["getProjects","getProjectsOutput"], () => require("./getProjects"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { ProjectArgs, ProjectState } from "./project";
export type Project = import("./project").Project;
export const Project: typeof import("./project").Project = null as any;
utilities.lazyLoad(exports, ["Project"], () => require("./project"));

export { QuotaArgs, QuotaState } from "./quota";
export type Quota = import("./quota").Quota;
export const Quota: typeof import("./quota").Quota = null as any;
utilities.lazyLoad(exports, ["Quota"], () => require("./quota"));

export { QuotaPlanArgs, QuotaPlanState } from "./quotaPlan";
export type QuotaPlan = import("./quotaPlan").QuotaPlan;
export const QuotaPlan: typeof import("./quotaPlan").QuotaPlan = null as any;
utilities.lazyLoad(exports, ["QuotaPlan"], () => require("./quotaPlan"));

export { QuotaScheduleArgs, QuotaScheduleState } from "./quotaSchedule";
export type QuotaSchedule = import("./quotaSchedule").QuotaSchedule;
export const QuotaSchedule: typeof import("./quotaSchedule").QuotaSchedule = null as any;
utilities.lazyLoad(exports, ["QuotaSchedule"], () => require("./quotaSchedule"));

export { RoleArgs, RoleState } from "./role";
export type Role = import("./role").Role;
export const Role: typeof import("./role").Role = null as any;
utilities.lazyLoad(exports, ["Role"], () => require("./role"));

export { RoleUserAttachmentArgs, RoleUserAttachmentState } from "./roleUserAttachment";
export type RoleUserAttachment = import("./roleUserAttachment").RoleUserAttachment;
export const RoleUserAttachment: typeof import("./roleUserAttachment").RoleUserAttachment = null as any;
utilities.lazyLoad(exports, ["RoleUserAttachment"], () => require("./roleUserAttachment"));

export { TunnelQuotaTimerArgs, TunnelQuotaTimerState } from "./tunnelQuotaTimer";
export type TunnelQuotaTimer = import("./tunnelQuotaTimer").TunnelQuotaTimer;
export const TunnelQuotaTimer: typeof import("./tunnelQuotaTimer").TunnelQuotaTimer = null as any;
utilities.lazyLoad(exports, ["TunnelQuotaTimer"], () => require("./tunnelQuotaTimer"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "alicloud:maxcompute/project:Project":
                return new Project(name, <any>undefined, { urn })
            case "alicloud:maxcompute/quota:Quota":
                return new Quota(name, <any>undefined, { urn })
            case "alicloud:maxcompute/quotaPlan:QuotaPlan":
                return new QuotaPlan(name, <any>undefined, { urn })
            case "alicloud:maxcompute/quotaSchedule:QuotaSchedule":
                return new QuotaSchedule(name, <any>undefined, { urn })
            case "alicloud:maxcompute/role:Role":
                return new Role(name, <any>undefined, { urn })
            case "alicloud:maxcompute/roleUserAttachment:RoleUserAttachment":
                return new RoleUserAttachment(name, <any>undefined, { urn })
            case "alicloud:maxcompute/tunnelQuotaTimer:TunnelQuotaTimer":
                return new TunnelQuotaTimer(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("alicloud", "maxcompute/project", _module)
pulumi.runtime.registerResourceModule("alicloud", "maxcompute/quota", _module)
pulumi.runtime.registerResourceModule("alicloud", "maxcompute/quotaPlan", _module)
pulumi.runtime.registerResourceModule("alicloud", "maxcompute/quotaSchedule", _module)
pulumi.runtime.registerResourceModule("alicloud", "maxcompute/role", _module)
pulumi.runtime.registerResourceModule("alicloud", "maxcompute/roleUserAttachment", _module)
pulumi.runtime.registerResourceModule("alicloud", "maxcompute/tunnelQuotaTimer", _module)
