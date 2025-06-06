// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.alicloud.cs.outputs.GetKubernetesNodePoolsNodepoolKubeletConfigurationReservedMemory;
import com.pulumi.alicloud.cs.outputs.GetKubernetesNodePoolsNodepoolKubeletConfigurationTracing;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetKubernetesNodePoolsNodepoolKubeletConfiguration {
    /**
     * @return Allowed sysctl mode whitelist.
     * 
     */
    private List<String> allowedUnsafeSysctls;
    /**
     * @return The list of IP addresses of the cluster DNS servers.
     * 
     */
    private List<String> clusterDns;
    /**
     * @return The maximum number of log files that can exist in each container.
     * 
     */
    private String containerLogMaxFiles;
    /**
     * @return The maximum size that can be reached before a log file is rotated.
     * 
     */
    private String containerLogMaxSize;
    /**
     * @return Specifies the maximum number of concurrent workers required to perform log rotation operations.
     * 
     */
    private String containerLogMaxWorkers;
    /**
     * @return Specifies the duration for which container logs are monitored for log rotation.
     * 
     */
    private String containerLogMonitorInterval;
    /**
     * @return CPU CFS quota constraint switch.
     * 
     */
    private String cpuCfsQuota;
    /**
     * @return CPU CFS quota period value.
     * 
     */
    private String cpuCfsQuotaPeriod;
    /**
     * @return Same as cpuManagerPolicy. The name of the policy to use. Requires the CPUManager feature gate to be enabled. Valid value is `none` or `static`.
     * 
     */
    private String cpuManagerPolicy;
    /**
     * @return Same as eventBurst. The maximum size of a burst of event creations, temporarily allows event creations to burst to this number, while still not exceeding `event_record_qps`. It is only used when `event_record_qps` is greater than 0. Valid value is `[0-100]`.
     * 
     */
    private String eventBurst;
    /**
     * @return Same as eventRecordQPS. The maximum event creations per second. If 0, there is no limit enforced. Valid value is `[0-50]`.
     * 
     */
    private String eventRecordQps;
    /**
     * @return Same as evictionHard. The map of signal names to quantities that defines hard eviction thresholds. For example: `{&#34;memory.available&#34; = &#34;300Mi&#34;}`.
     * 
     */
    private Map<String,String> evictionHard;
    /**
     * @return Same as evictionSoft. The map of signal names to quantities that defines soft eviction thresholds. For example: `{&#34;memory.available&#34; = &#34;300Mi&#34;}`.
     * 
     */
    private Map<String,String> evictionSoft;
    /**
     * @return Same as evictionSoftGracePeriod. The map of signal names to quantities that defines grace periods for each soft eviction signal. For example: `{&#34;memory.available&#34; = &#34;30s&#34;}`.
     * 
     */
    private Map<String,String> evictionSoftGracePeriod;
    /**
     * @return Feature switch to enable configuration of experimental features.
     * 
     */
    private Map<String,String> featureGates;
    /**
     * @return If the image usage exceeds this threshold, image garbage collection will continue.
     * 
     */
    private String imageGcHighThresholdPercent;
    /**
     * @return Image garbage collection is not performed when the image usage is below this threshold.
     * 
     */
    private String imageGcLowThresholdPercent;
    /**
     * @return Same as kubeAPIBurst. The burst to allow while talking with kubernetes api-server. Valid value is `[0-100]`.
     * 
     */
    private String kubeApiBurst;
    /**
     * @return Same as kubeAPIQPS. The QPS to use while talking with kubernetes api-server. Valid value is `[0-50]`.
     * 
     */
    private String kubeApiQps;
    /**
     * @return Same as kubeReserved. The set of ResourceName=ResourceQuantity (e.g. cpu=200m,memory=150G) pairs that describe resources reserved for kubernetes system components. Currently, cpu, memory and local storage for root file system are supported. See [compute resources](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/) for more details.
     * 
     */
    private Map<String,String> kubeReserved;
    /**
     * @return The maximum number of running pods.
     * 
     */
    private String maxPods;
    /**
     * @return The policy to be used by the memory manager.
     * 
     */
    private String memoryManagerPolicy;
    /**
     * @return The maximum number of PIDs that can be used in a Pod.
     * 
     */
    private String podPidsLimit;
    /**
     * @return Read-only port number.
     * 
     */
    private String readOnlyPort;
    /**
     * @return Same as registryBurst. The maximum size of burst pulls, temporarily allows pulls to burst to this number, while still not exceeding `registry_pull_qps`. Only used if `registry_pull_qps` is greater than 0. Valid value is `[0-100]`.
     * 
     */
    private String registryBurst;
    /**
     * @return Same as registryPullQPS. The limit of registry pulls per second. Setting it to `0` means no limit. Valid value is `[0-50]`.
     * 
     */
    private String registryPullQps;
    /**
     * @return Reserve memory for NUMA nodes.
     * 
     */
    private List<GetKubernetesNodePoolsNodepoolKubeletConfigurationReservedMemory> reservedMemories;
    /**
     * @return Same as serializeImagePulls. When enabled, it tells the Kubelet to pull images one at a time. We recommend not changing the default value on nodes that run docker daemon with version &lt; 1.9 or an Aufs storage backend. Valid value is `true` or `false`.
     * 
     */
    private String serializeImagePulls;
    /**
     * @return Same as systemReserved. The set of ResourceName=ResourceQuantity (e.g. cpu=200m,memory=150G) pairs that describe resources reserved for non-kubernetes components. Currently, only cpu and memory are supported. See [compute resources](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/) for more details.
     * 
     */
    private Map<String,String> systemReserved;
    /**
     * @return Name of the Topology Manager policy used.
     * 
     */
    private String topologyManagerPolicy;
    /**
     * @return OpenTelemetry tracks the configuration information for client settings versioning.
     * 
     */
    private GetKubernetesNodePoolsNodepoolKubeletConfigurationTracing tracing;

    private GetKubernetesNodePoolsNodepoolKubeletConfiguration() {}
    /**
     * @return Allowed sysctl mode whitelist.
     * 
     */
    public List<String> allowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls;
    }
    /**
     * @return The list of IP addresses of the cluster DNS servers.
     * 
     */
    public List<String> clusterDns() {
        return this.clusterDns;
    }
    /**
     * @return The maximum number of log files that can exist in each container.
     * 
     */
    public String containerLogMaxFiles() {
        return this.containerLogMaxFiles;
    }
    /**
     * @return The maximum size that can be reached before a log file is rotated.
     * 
     */
    public String containerLogMaxSize() {
        return this.containerLogMaxSize;
    }
    /**
     * @return Specifies the maximum number of concurrent workers required to perform log rotation operations.
     * 
     */
    public String containerLogMaxWorkers() {
        return this.containerLogMaxWorkers;
    }
    /**
     * @return Specifies the duration for which container logs are monitored for log rotation.
     * 
     */
    public String containerLogMonitorInterval() {
        return this.containerLogMonitorInterval;
    }
    /**
     * @return CPU CFS quota constraint switch.
     * 
     */
    public String cpuCfsQuota() {
        return this.cpuCfsQuota;
    }
    /**
     * @return CPU CFS quota period value.
     * 
     */
    public String cpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod;
    }
    /**
     * @return Same as cpuManagerPolicy. The name of the policy to use. Requires the CPUManager feature gate to be enabled. Valid value is `none` or `static`.
     * 
     */
    public String cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }
    /**
     * @return Same as eventBurst. The maximum size of a burst of event creations, temporarily allows event creations to burst to this number, while still not exceeding `event_record_qps`. It is only used when `event_record_qps` is greater than 0. Valid value is `[0-100]`.
     * 
     */
    public String eventBurst() {
        return this.eventBurst;
    }
    /**
     * @return Same as eventRecordQPS. The maximum event creations per second. If 0, there is no limit enforced. Valid value is `[0-50]`.
     * 
     */
    public String eventRecordQps() {
        return this.eventRecordQps;
    }
    /**
     * @return Same as evictionHard. The map of signal names to quantities that defines hard eviction thresholds. For example: `{&#34;memory.available&#34; = &#34;300Mi&#34;}`.
     * 
     */
    public Map<String,String> evictionHard() {
        return this.evictionHard;
    }
    /**
     * @return Same as evictionSoft. The map of signal names to quantities that defines soft eviction thresholds. For example: `{&#34;memory.available&#34; = &#34;300Mi&#34;}`.
     * 
     */
    public Map<String,String> evictionSoft() {
        return this.evictionSoft;
    }
    /**
     * @return Same as evictionSoftGracePeriod. The map of signal names to quantities that defines grace periods for each soft eviction signal. For example: `{&#34;memory.available&#34; = &#34;30s&#34;}`.
     * 
     */
    public Map<String,String> evictionSoftGracePeriod() {
        return this.evictionSoftGracePeriod;
    }
    /**
     * @return Feature switch to enable configuration of experimental features.
     * 
     */
    public Map<String,String> featureGates() {
        return this.featureGates;
    }
    /**
     * @return If the image usage exceeds this threshold, image garbage collection will continue.
     * 
     */
    public String imageGcHighThresholdPercent() {
        return this.imageGcHighThresholdPercent;
    }
    /**
     * @return Image garbage collection is not performed when the image usage is below this threshold.
     * 
     */
    public String imageGcLowThresholdPercent() {
        return this.imageGcLowThresholdPercent;
    }
    /**
     * @return Same as kubeAPIBurst. The burst to allow while talking with kubernetes api-server. Valid value is `[0-100]`.
     * 
     */
    public String kubeApiBurst() {
        return this.kubeApiBurst;
    }
    /**
     * @return Same as kubeAPIQPS. The QPS to use while talking with kubernetes api-server. Valid value is `[0-50]`.
     * 
     */
    public String kubeApiQps() {
        return this.kubeApiQps;
    }
    /**
     * @return Same as kubeReserved. The set of ResourceName=ResourceQuantity (e.g. cpu=200m,memory=150G) pairs that describe resources reserved for kubernetes system components. Currently, cpu, memory and local storage for root file system are supported. See [compute resources](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/) for more details.
     * 
     */
    public Map<String,String> kubeReserved() {
        return this.kubeReserved;
    }
    /**
     * @return The maximum number of running pods.
     * 
     */
    public String maxPods() {
        return this.maxPods;
    }
    /**
     * @return The policy to be used by the memory manager.
     * 
     */
    public String memoryManagerPolicy() {
        return this.memoryManagerPolicy;
    }
    /**
     * @return The maximum number of PIDs that can be used in a Pod.
     * 
     */
    public String podPidsLimit() {
        return this.podPidsLimit;
    }
    /**
     * @return Read-only port number.
     * 
     */
    public String readOnlyPort() {
        return this.readOnlyPort;
    }
    /**
     * @return Same as registryBurst. The maximum size of burst pulls, temporarily allows pulls to burst to this number, while still not exceeding `registry_pull_qps`. Only used if `registry_pull_qps` is greater than 0. Valid value is `[0-100]`.
     * 
     */
    public String registryBurst() {
        return this.registryBurst;
    }
    /**
     * @return Same as registryPullQPS. The limit of registry pulls per second. Setting it to `0` means no limit. Valid value is `[0-50]`.
     * 
     */
    public String registryPullQps() {
        return this.registryPullQps;
    }
    /**
     * @return Reserve memory for NUMA nodes.
     * 
     */
    public List<GetKubernetesNodePoolsNodepoolKubeletConfigurationReservedMemory> reservedMemories() {
        return this.reservedMemories;
    }
    /**
     * @return Same as serializeImagePulls. When enabled, it tells the Kubelet to pull images one at a time. We recommend not changing the default value on nodes that run docker daemon with version &lt; 1.9 or an Aufs storage backend. Valid value is `true` or `false`.
     * 
     */
    public String serializeImagePulls() {
        return this.serializeImagePulls;
    }
    /**
     * @return Same as systemReserved. The set of ResourceName=ResourceQuantity (e.g. cpu=200m,memory=150G) pairs that describe resources reserved for non-kubernetes components. Currently, only cpu and memory are supported. See [compute resources](https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/) for more details.
     * 
     */
    public Map<String,String> systemReserved() {
        return this.systemReserved;
    }
    /**
     * @return Name of the Topology Manager policy used.
     * 
     */
    public String topologyManagerPolicy() {
        return this.topologyManagerPolicy;
    }
    /**
     * @return OpenTelemetry tracks the configuration information for client settings versioning.
     * 
     */
    public GetKubernetesNodePoolsNodepoolKubeletConfigurationTracing tracing() {
        return this.tracing;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesNodePoolsNodepoolKubeletConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedUnsafeSysctls;
        private List<String> clusterDns;
        private String containerLogMaxFiles;
        private String containerLogMaxSize;
        private String containerLogMaxWorkers;
        private String containerLogMonitorInterval;
        private String cpuCfsQuota;
        private String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;
        private String eventBurst;
        private String eventRecordQps;
        private Map<String,String> evictionHard;
        private Map<String,String> evictionSoft;
        private Map<String,String> evictionSoftGracePeriod;
        private Map<String,String> featureGates;
        private String imageGcHighThresholdPercent;
        private String imageGcLowThresholdPercent;
        private String kubeApiBurst;
        private String kubeApiQps;
        private Map<String,String> kubeReserved;
        private String maxPods;
        private String memoryManagerPolicy;
        private String podPidsLimit;
        private String readOnlyPort;
        private String registryBurst;
        private String registryPullQps;
        private List<GetKubernetesNodePoolsNodepoolKubeletConfigurationReservedMemory> reservedMemories;
        private String serializeImagePulls;
        private Map<String,String> systemReserved;
        private String topologyManagerPolicy;
        private GetKubernetesNodePoolsNodepoolKubeletConfigurationTracing tracing;
        public Builder() {}
        public Builder(GetKubernetesNodePoolsNodepoolKubeletConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedUnsafeSysctls = defaults.allowedUnsafeSysctls;
    	      this.clusterDns = defaults.clusterDns;
    	      this.containerLogMaxFiles = defaults.containerLogMaxFiles;
    	      this.containerLogMaxSize = defaults.containerLogMaxSize;
    	      this.containerLogMaxWorkers = defaults.containerLogMaxWorkers;
    	      this.containerLogMonitorInterval = defaults.containerLogMonitorInterval;
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
    	      this.eventBurst = defaults.eventBurst;
    	      this.eventRecordQps = defaults.eventRecordQps;
    	      this.evictionHard = defaults.evictionHard;
    	      this.evictionSoft = defaults.evictionSoft;
    	      this.evictionSoftGracePeriod = defaults.evictionSoftGracePeriod;
    	      this.featureGates = defaults.featureGates;
    	      this.imageGcHighThresholdPercent = defaults.imageGcHighThresholdPercent;
    	      this.imageGcLowThresholdPercent = defaults.imageGcLowThresholdPercent;
    	      this.kubeApiBurst = defaults.kubeApiBurst;
    	      this.kubeApiQps = defaults.kubeApiQps;
    	      this.kubeReserved = defaults.kubeReserved;
    	      this.maxPods = defaults.maxPods;
    	      this.memoryManagerPolicy = defaults.memoryManagerPolicy;
    	      this.podPidsLimit = defaults.podPidsLimit;
    	      this.readOnlyPort = defaults.readOnlyPort;
    	      this.registryBurst = defaults.registryBurst;
    	      this.registryPullQps = defaults.registryPullQps;
    	      this.reservedMemories = defaults.reservedMemories;
    	      this.serializeImagePulls = defaults.serializeImagePulls;
    	      this.systemReserved = defaults.systemReserved;
    	      this.topologyManagerPolicy = defaults.topologyManagerPolicy;
    	      this.tracing = defaults.tracing;
        }

        @CustomType.Setter
        public Builder allowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
            if (allowedUnsafeSysctls == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "allowedUnsafeSysctls");
            }
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }
        public Builder allowedUnsafeSysctls(String... allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(List.of(allowedUnsafeSysctls));
        }
        @CustomType.Setter
        public Builder clusterDns(List<String> clusterDns) {
            if (clusterDns == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "clusterDns");
            }
            this.clusterDns = clusterDns;
            return this;
        }
        public Builder clusterDns(String... clusterDns) {
            return clusterDns(List.of(clusterDns));
        }
        @CustomType.Setter
        public Builder containerLogMaxFiles(String containerLogMaxFiles) {
            if (containerLogMaxFiles == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "containerLogMaxFiles");
            }
            this.containerLogMaxFiles = containerLogMaxFiles;
            return this;
        }
        @CustomType.Setter
        public Builder containerLogMaxSize(String containerLogMaxSize) {
            if (containerLogMaxSize == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "containerLogMaxSize");
            }
            this.containerLogMaxSize = containerLogMaxSize;
            return this;
        }
        @CustomType.Setter
        public Builder containerLogMaxWorkers(String containerLogMaxWorkers) {
            if (containerLogMaxWorkers == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "containerLogMaxWorkers");
            }
            this.containerLogMaxWorkers = containerLogMaxWorkers;
            return this;
        }
        @CustomType.Setter
        public Builder containerLogMonitorInterval(String containerLogMonitorInterval) {
            if (containerLogMonitorInterval == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "containerLogMonitorInterval");
            }
            this.containerLogMonitorInterval = containerLogMonitorInterval;
            return this;
        }
        @CustomType.Setter
        public Builder cpuCfsQuota(String cpuCfsQuota) {
            if (cpuCfsQuota == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "cpuCfsQuota");
            }
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }
        @CustomType.Setter
        public Builder cpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            if (cpuCfsQuotaPeriod == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "cpuCfsQuotaPeriod");
            }
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            if (cpuManagerPolicy == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "cpuManagerPolicy");
            }
            this.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder eventBurst(String eventBurst) {
            if (eventBurst == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "eventBurst");
            }
            this.eventBurst = eventBurst;
            return this;
        }
        @CustomType.Setter
        public Builder eventRecordQps(String eventRecordQps) {
            if (eventRecordQps == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "eventRecordQps");
            }
            this.eventRecordQps = eventRecordQps;
            return this;
        }
        @CustomType.Setter
        public Builder evictionHard(Map<String,String> evictionHard) {
            if (evictionHard == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "evictionHard");
            }
            this.evictionHard = evictionHard;
            return this;
        }
        @CustomType.Setter
        public Builder evictionSoft(Map<String,String> evictionSoft) {
            if (evictionSoft == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "evictionSoft");
            }
            this.evictionSoft = evictionSoft;
            return this;
        }
        @CustomType.Setter
        public Builder evictionSoftGracePeriod(Map<String,String> evictionSoftGracePeriod) {
            if (evictionSoftGracePeriod == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "evictionSoftGracePeriod");
            }
            this.evictionSoftGracePeriod = evictionSoftGracePeriod;
            return this;
        }
        @CustomType.Setter
        public Builder featureGates(Map<String,String> featureGates) {
            if (featureGates == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "featureGates");
            }
            this.featureGates = featureGates;
            return this;
        }
        @CustomType.Setter
        public Builder imageGcHighThresholdPercent(String imageGcHighThresholdPercent) {
            if (imageGcHighThresholdPercent == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "imageGcHighThresholdPercent");
            }
            this.imageGcHighThresholdPercent = imageGcHighThresholdPercent;
            return this;
        }
        @CustomType.Setter
        public Builder imageGcLowThresholdPercent(String imageGcLowThresholdPercent) {
            if (imageGcLowThresholdPercent == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "imageGcLowThresholdPercent");
            }
            this.imageGcLowThresholdPercent = imageGcLowThresholdPercent;
            return this;
        }
        @CustomType.Setter
        public Builder kubeApiBurst(String kubeApiBurst) {
            if (kubeApiBurst == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "kubeApiBurst");
            }
            this.kubeApiBurst = kubeApiBurst;
            return this;
        }
        @CustomType.Setter
        public Builder kubeApiQps(String kubeApiQps) {
            if (kubeApiQps == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "kubeApiQps");
            }
            this.kubeApiQps = kubeApiQps;
            return this;
        }
        @CustomType.Setter
        public Builder kubeReserved(Map<String,String> kubeReserved) {
            if (kubeReserved == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "kubeReserved");
            }
            this.kubeReserved = kubeReserved;
            return this;
        }
        @CustomType.Setter
        public Builder maxPods(String maxPods) {
            if (maxPods == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "maxPods");
            }
            this.maxPods = maxPods;
            return this;
        }
        @CustomType.Setter
        public Builder memoryManagerPolicy(String memoryManagerPolicy) {
            if (memoryManagerPolicy == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "memoryManagerPolicy");
            }
            this.memoryManagerPolicy = memoryManagerPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder podPidsLimit(String podPidsLimit) {
            if (podPidsLimit == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "podPidsLimit");
            }
            this.podPidsLimit = podPidsLimit;
            return this;
        }
        @CustomType.Setter
        public Builder readOnlyPort(String readOnlyPort) {
            if (readOnlyPort == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "readOnlyPort");
            }
            this.readOnlyPort = readOnlyPort;
            return this;
        }
        @CustomType.Setter
        public Builder registryBurst(String registryBurst) {
            if (registryBurst == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "registryBurst");
            }
            this.registryBurst = registryBurst;
            return this;
        }
        @CustomType.Setter
        public Builder registryPullQps(String registryPullQps) {
            if (registryPullQps == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "registryPullQps");
            }
            this.registryPullQps = registryPullQps;
            return this;
        }
        @CustomType.Setter
        public Builder reservedMemories(List<GetKubernetesNodePoolsNodepoolKubeletConfigurationReservedMemory> reservedMemories) {
            if (reservedMemories == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "reservedMemories");
            }
            this.reservedMemories = reservedMemories;
            return this;
        }
        public Builder reservedMemories(GetKubernetesNodePoolsNodepoolKubeletConfigurationReservedMemory... reservedMemories) {
            return reservedMemories(List.of(reservedMemories));
        }
        @CustomType.Setter
        public Builder serializeImagePulls(String serializeImagePulls) {
            if (serializeImagePulls == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "serializeImagePulls");
            }
            this.serializeImagePulls = serializeImagePulls;
            return this;
        }
        @CustomType.Setter
        public Builder systemReserved(Map<String,String> systemReserved) {
            if (systemReserved == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "systemReserved");
            }
            this.systemReserved = systemReserved;
            return this;
        }
        @CustomType.Setter
        public Builder topologyManagerPolicy(String topologyManagerPolicy) {
            if (topologyManagerPolicy == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "topologyManagerPolicy");
            }
            this.topologyManagerPolicy = topologyManagerPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder tracing(GetKubernetesNodePoolsNodepoolKubeletConfigurationTracing tracing) {
            if (tracing == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolKubeletConfiguration", "tracing");
            }
            this.tracing = tracing;
            return this;
        }
        public GetKubernetesNodePoolsNodepoolKubeletConfiguration build() {
            final var _resultValue = new GetKubernetesNodePoolsNodepoolKubeletConfiguration();
            _resultValue.allowedUnsafeSysctls = allowedUnsafeSysctls;
            _resultValue.clusterDns = clusterDns;
            _resultValue.containerLogMaxFiles = containerLogMaxFiles;
            _resultValue.containerLogMaxSize = containerLogMaxSize;
            _resultValue.containerLogMaxWorkers = containerLogMaxWorkers;
            _resultValue.containerLogMonitorInterval = containerLogMonitorInterval;
            _resultValue.cpuCfsQuota = cpuCfsQuota;
            _resultValue.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            _resultValue.cpuManagerPolicy = cpuManagerPolicy;
            _resultValue.eventBurst = eventBurst;
            _resultValue.eventRecordQps = eventRecordQps;
            _resultValue.evictionHard = evictionHard;
            _resultValue.evictionSoft = evictionSoft;
            _resultValue.evictionSoftGracePeriod = evictionSoftGracePeriod;
            _resultValue.featureGates = featureGates;
            _resultValue.imageGcHighThresholdPercent = imageGcHighThresholdPercent;
            _resultValue.imageGcLowThresholdPercent = imageGcLowThresholdPercent;
            _resultValue.kubeApiBurst = kubeApiBurst;
            _resultValue.kubeApiQps = kubeApiQps;
            _resultValue.kubeReserved = kubeReserved;
            _resultValue.maxPods = maxPods;
            _resultValue.memoryManagerPolicy = memoryManagerPolicy;
            _resultValue.podPidsLimit = podPidsLimit;
            _resultValue.readOnlyPort = readOnlyPort;
            _resultValue.registryBurst = registryBurst;
            _resultValue.registryPullQps = registryPullQps;
            _resultValue.reservedMemories = reservedMemories;
            _resultValue.serializeImagePulls = serializeImagePulls;
            _resultValue.systemReserved = systemReserved;
            _resultValue.topologyManagerPolicy = topologyManagerPolicy;
            _resultValue.tracing = tracing;
            return _resultValue;
        }
    }
}
