// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.alicloud.cms.outputs.GetHybridMonitorSlsTasksTaskAttachLabel;
import com.pulumi.alicloud.cms.outputs.GetHybridMonitorSlsTasksTaskMatchExpress;
import com.pulumi.alicloud.cms.outputs.GetHybridMonitorSlsTasksTaskSlsProcessConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetHybridMonitorSlsTasksTask {
    /**
     * @return The tags of the metric import task.
     * 
     */
    private final List<GetHybridMonitorSlsTasksTaskAttachLabel> attachLabels;
    /**
     * @return The interval between the cloud monitoring plug-in collecting host monitoring data.
     * 
     */
    private final Integer collectInterval;
    /**
     * @return The address where the cloudmonitor Plug-In collects the monitoring data of the host.
     * 
     */
    private final String collectTargetEndpoint;
    /**
     * @return When the cloud monitor Agent collects, the relative path of the collection.
     * 
     */
    private final String collectTargetPath;
    /**
     * @return The type of the monitoring data. Valid values: Spring, Tomcat, Nginx, Tengine, JVM, Redis, MySQL, and AWS.
     * 
     */
    private final String collectTargetType;
    /**
     * @return The timeout period for the cloudmonitor plug-in to collect host monitoring data.
     * 
     */
    private final Integer collectTimout;
    /**
     * @return Create the timestamp of the monitoring task. Unit: milliseconds.
     * 
     */
    private final String createTime;
    /**
     * @return Monitoring task description.
     * 
     */
    private final String description;
    /**
     * @return Additional information for the instance.
     * 
     */
    private final String extraInfo;
    /**
     * @return The ID of the application Group.
     * 
     */
    private final String groupId;
    /**
     * @return The ID of the monitoring task.
     * 
     */
    private final String hybridMonitorSlsTaskId;
    /**
     * @return The ID of the Hybrid Monitor Sls Task.
     * 
     */
    private final String id;
    /**
     * @return A list of instances where monitoring data is collected in batches.
     * 
     */
    private final List<String> instances;
    /**
     * @return The path where on-premises log data is stored. On-premises log data is stored in the specified path of the host where CloudMonitor is deployed.
     * 
     */
    private final String logFilePath;
    /**
     * @return Local Log Monitoring and calculation method.
     * 
     */
    private final String logProcess;
    /**
     * @return The sample on-premises log.
     * 
     */
    private final String logSample;
    /**
     * @return The local log data is divided according to different matching patterns.
     * 
     */
    private final String logSplit;
    /**
     * @return The filter condition of the instance of the monitoring task.
     * 
     */
    private final String matchExpressRelation;
    /**
     * @return The matching condition of the instance in the application Group.
     * 
     */
    private final List<GetHybridMonitorSlsTasksTaskMatchExpress> matchExpresses;
    /**
     * @return The namespace to which the host belongs.
     * 
     */
    private final String namespace;
    /**
     * @return The network type of the host.
     * 
     */
    private final String networkType;
    /**
     * @return The configurations of the logs that are imported from Log Service.
     * 
     */
    private final String slsProcess;
    /**
     * @return The configurations of the logs that are imported from Log Service.
     * 
     */
    private final List<GetHybridMonitorSlsTasksTaskSlsProcessConfig> slsProcessConfigs;
    /**
     * @return The name of the metric import task.
     * 
     */
    private final String taskName;
    /**
     * @return Monitoring Task type.
     * 
     */
    private final String taskType;
    /**
     * @return The region where the host resides.
     * 
     */
    private final String uploadRegion;
    private final String yarmConfig;

    @CustomType.Constructor
    private GetHybridMonitorSlsTasksTask(
        @CustomType.Parameter("attachLabels") List<GetHybridMonitorSlsTasksTaskAttachLabel> attachLabels,
        @CustomType.Parameter("collectInterval") Integer collectInterval,
        @CustomType.Parameter("collectTargetEndpoint") String collectTargetEndpoint,
        @CustomType.Parameter("collectTargetPath") String collectTargetPath,
        @CustomType.Parameter("collectTargetType") String collectTargetType,
        @CustomType.Parameter("collectTimout") Integer collectTimout,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("extraInfo") String extraInfo,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("hybridMonitorSlsTaskId") String hybridMonitorSlsTaskId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instances") List<String> instances,
        @CustomType.Parameter("logFilePath") String logFilePath,
        @CustomType.Parameter("logProcess") String logProcess,
        @CustomType.Parameter("logSample") String logSample,
        @CustomType.Parameter("logSplit") String logSplit,
        @CustomType.Parameter("matchExpressRelation") String matchExpressRelation,
        @CustomType.Parameter("matchExpresses") List<GetHybridMonitorSlsTasksTaskMatchExpress> matchExpresses,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("slsProcess") String slsProcess,
        @CustomType.Parameter("slsProcessConfigs") List<GetHybridMonitorSlsTasksTaskSlsProcessConfig> slsProcessConfigs,
        @CustomType.Parameter("taskName") String taskName,
        @CustomType.Parameter("taskType") String taskType,
        @CustomType.Parameter("uploadRegion") String uploadRegion,
        @CustomType.Parameter("yarmConfig") String yarmConfig) {
        this.attachLabels = attachLabels;
        this.collectInterval = collectInterval;
        this.collectTargetEndpoint = collectTargetEndpoint;
        this.collectTargetPath = collectTargetPath;
        this.collectTargetType = collectTargetType;
        this.collectTimout = collectTimout;
        this.createTime = createTime;
        this.description = description;
        this.extraInfo = extraInfo;
        this.groupId = groupId;
        this.hybridMonitorSlsTaskId = hybridMonitorSlsTaskId;
        this.id = id;
        this.instances = instances;
        this.logFilePath = logFilePath;
        this.logProcess = logProcess;
        this.logSample = logSample;
        this.logSplit = logSplit;
        this.matchExpressRelation = matchExpressRelation;
        this.matchExpresses = matchExpresses;
        this.namespace = namespace;
        this.networkType = networkType;
        this.slsProcess = slsProcess;
        this.slsProcessConfigs = slsProcessConfigs;
        this.taskName = taskName;
        this.taskType = taskType;
        this.uploadRegion = uploadRegion;
        this.yarmConfig = yarmConfig;
    }

    /**
     * @return The tags of the metric import task.
     * 
     */
    public List<GetHybridMonitorSlsTasksTaskAttachLabel> attachLabels() {
        return this.attachLabels;
    }
    /**
     * @return The interval between the cloud monitoring plug-in collecting host monitoring data.
     * 
     */
    public Integer collectInterval() {
        return this.collectInterval;
    }
    /**
     * @return The address where the cloudmonitor Plug-In collects the monitoring data of the host.
     * 
     */
    public String collectTargetEndpoint() {
        return this.collectTargetEndpoint;
    }
    /**
     * @return When the cloud monitor Agent collects, the relative path of the collection.
     * 
     */
    public String collectTargetPath() {
        return this.collectTargetPath;
    }
    /**
     * @return The type of the monitoring data. Valid values: Spring, Tomcat, Nginx, Tengine, JVM, Redis, MySQL, and AWS.
     * 
     */
    public String collectTargetType() {
        return this.collectTargetType;
    }
    /**
     * @return The timeout period for the cloudmonitor plug-in to collect host monitoring data.
     * 
     */
    public Integer collectTimout() {
        return this.collectTimout;
    }
    /**
     * @return Create the timestamp of the monitoring task. Unit: milliseconds.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Monitoring task description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Additional information for the instance.
     * 
     */
    public String extraInfo() {
        return this.extraInfo;
    }
    /**
     * @return The ID of the application Group.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The ID of the monitoring task.
     * 
     */
    public String hybridMonitorSlsTaskId() {
        return this.hybridMonitorSlsTaskId;
    }
    /**
     * @return The ID of the Hybrid Monitor Sls Task.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of instances where monitoring data is collected in batches.
     * 
     */
    public List<String> instances() {
        return this.instances;
    }
    /**
     * @return The path where on-premises log data is stored. On-premises log data is stored in the specified path of the host where CloudMonitor is deployed.
     * 
     */
    public String logFilePath() {
        return this.logFilePath;
    }
    /**
     * @return Local Log Monitoring and calculation method.
     * 
     */
    public String logProcess() {
        return this.logProcess;
    }
    /**
     * @return The sample on-premises log.
     * 
     */
    public String logSample() {
        return this.logSample;
    }
    /**
     * @return The local log data is divided according to different matching patterns.
     * 
     */
    public String logSplit() {
        return this.logSplit;
    }
    /**
     * @return The filter condition of the instance of the monitoring task.
     * 
     */
    public String matchExpressRelation() {
        return this.matchExpressRelation;
    }
    /**
     * @return The matching condition of the instance in the application Group.
     * 
     */
    public List<GetHybridMonitorSlsTasksTaskMatchExpress> matchExpresses() {
        return this.matchExpresses;
    }
    /**
     * @return The namespace to which the host belongs.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The network type of the host.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The configurations of the logs that are imported from Log Service.
     * 
     */
    public String slsProcess() {
        return this.slsProcess;
    }
    /**
     * @return The configurations of the logs that are imported from Log Service.
     * 
     */
    public List<GetHybridMonitorSlsTasksTaskSlsProcessConfig> slsProcessConfigs() {
        return this.slsProcessConfigs;
    }
    /**
     * @return The name of the metric import task.
     * 
     */
    public String taskName() {
        return this.taskName;
    }
    /**
     * @return Monitoring Task type.
     * 
     */
    public String taskType() {
        return this.taskType;
    }
    /**
     * @return The region where the host resides.
     * 
     */
    public String uploadRegion() {
        return this.uploadRegion;
    }
    public String yarmConfig() {
        return this.yarmConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridMonitorSlsTasksTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetHybridMonitorSlsTasksTaskAttachLabel> attachLabels;
        private Integer collectInterval;
        private String collectTargetEndpoint;
        private String collectTargetPath;
        private String collectTargetType;
        private Integer collectTimout;
        private String createTime;
        private String description;
        private String extraInfo;
        private String groupId;
        private String hybridMonitorSlsTaskId;
        private String id;
        private List<String> instances;
        private String logFilePath;
        private String logProcess;
        private String logSample;
        private String logSplit;
        private String matchExpressRelation;
        private List<GetHybridMonitorSlsTasksTaskMatchExpress> matchExpresses;
        private String namespace;
        private String networkType;
        private String slsProcess;
        private List<GetHybridMonitorSlsTasksTaskSlsProcessConfig> slsProcessConfigs;
        private String taskName;
        private String taskType;
        private String uploadRegion;
        private String yarmConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridMonitorSlsTasksTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachLabels = defaults.attachLabels;
    	      this.collectInterval = defaults.collectInterval;
    	      this.collectTargetEndpoint = defaults.collectTargetEndpoint;
    	      this.collectTargetPath = defaults.collectTargetPath;
    	      this.collectTargetType = defaults.collectTargetType;
    	      this.collectTimout = defaults.collectTimout;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.extraInfo = defaults.extraInfo;
    	      this.groupId = defaults.groupId;
    	      this.hybridMonitorSlsTaskId = defaults.hybridMonitorSlsTaskId;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.logFilePath = defaults.logFilePath;
    	      this.logProcess = defaults.logProcess;
    	      this.logSample = defaults.logSample;
    	      this.logSplit = defaults.logSplit;
    	      this.matchExpressRelation = defaults.matchExpressRelation;
    	      this.matchExpresses = defaults.matchExpresses;
    	      this.namespace = defaults.namespace;
    	      this.networkType = defaults.networkType;
    	      this.slsProcess = defaults.slsProcess;
    	      this.slsProcessConfigs = defaults.slsProcessConfigs;
    	      this.taskName = defaults.taskName;
    	      this.taskType = defaults.taskType;
    	      this.uploadRegion = defaults.uploadRegion;
    	      this.yarmConfig = defaults.yarmConfig;
        }

        public Builder attachLabels(List<GetHybridMonitorSlsTasksTaskAttachLabel> attachLabels) {
            this.attachLabels = Objects.requireNonNull(attachLabels);
            return this;
        }
        public Builder attachLabels(GetHybridMonitorSlsTasksTaskAttachLabel... attachLabels) {
            return attachLabels(List.of(attachLabels));
        }
        public Builder collectInterval(Integer collectInterval) {
            this.collectInterval = Objects.requireNonNull(collectInterval);
            return this;
        }
        public Builder collectTargetEndpoint(String collectTargetEndpoint) {
            this.collectTargetEndpoint = Objects.requireNonNull(collectTargetEndpoint);
            return this;
        }
        public Builder collectTargetPath(String collectTargetPath) {
            this.collectTargetPath = Objects.requireNonNull(collectTargetPath);
            return this;
        }
        public Builder collectTargetType(String collectTargetType) {
            this.collectTargetType = Objects.requireNonNull(collectTargetType);
            return this;
        }
        public Builder collectTimout(Integer collectTimout) {
            this.collectTimout = Objects.requireNonNull(collectTimout);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder extraInfo(String extraInfo) {
            this.extraInfo = Objects.requireNonNull(extraInfo);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder hybridMonitorSlsTaskId(String hybridMonitorSlsTaskId) {
            this.hybridMonitorSlsTaskId = Objects.requireNonNull(hybridMonitorSlsTaskId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder logFilePath(String logFilePath) {
            this.logFilePath = Objects.requireNonNull(logFilePath);
            return this;
        }
        public Builder logProcess(String logProcess) {
            this.logProcess = Objects.requireNonNull(logProcess);
            return this;
        }
        public Builder logSample(String logSample) {
            this.logSample = Objects.requireNonNull(logSample);
            return this;
        }
        public Builder logSplit(String logSplit) {
            this.logSplit = Objects.requireNonNull(logSplit);
            return this;
        }
        public Builder matchExpressRelation(String matchExpressRelation) {
            this.matchExpressRelation = Objects.requireNonNull(matchExpressRelation);
            return this;
        }
        public Builder matchExpresses(List<GetHybridMonitorSlsTasksTaskMatchExpress> matchExpresses) {
            this.matchExpresses = Objects.requireNonNull(matchExpresses);
            return this;
        }
        public Builder matchExpresses(GetHybridMonitorSlsTasksTaskMatchExpress... matchExpresses) {
            return matchExpresses(List.of(matchExpresses));
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder slsProcess(String slsProcess) {
            this.slsProcess = Objects.requireNonNull(slsProcess);
            return this;
        }
        public Builder slsProcessConfigs(List<GetHybridMonitorSlsTasksTaskSlsProcessConfig> slsProcessConfigs) {
            this.slsProcessConfigs = Objects.requireNonNull(slsProcessConfigs);
            return this;
        }
        public Builder slsProcessConfigs(GetHybridMonitorSlsTasksTaskSlsProcessConfig... slsProcessConfigs) {
            return slsProcessConfigs(List.of(slsProcessConfigs));
        }
        public Builder taskName(String taskName) {
            this.taskName = Objects.requireNonNull(taskName);
            return this;
        }
        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }
        public Builder uploadRegion(String uploadRegion) {
            this.uploadRegion = Objects.requireNonNull(uploadRegion);
            return this;
        }
        public Builder yarmConfig(String yarmConfig) {
            this.yarmConfig = Objects.requireNonNull(yarmConfig);
            return this;
        }        public GetHybridMonitorSlsTasksTask build() {
            return new GetHybridMonitorSlsTasksTask(attachLabels, collectInterval, collectTargetEndpoint, collectTargetPath, collectTargetType, collectTimout, createTime, description, extraInfo, groupId, hybridMonitorSlsTaskId, id, instances, logFilePath, logProcess, logSample, logSplit, matchExpressRelation, matchExpresses, namespace, networkType, slsProcess, slsProcessConfigs, taskName, taskType, uploadRegion, yarmConfig);
        }
    }
}