// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.schedulerx;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppGroupArgs Empty = new AppGroupArgs();

    /**
     * Application Name
     * 
     */
    @Import(name="appName", required=true)
    private Output<String> appName;

    /**
     * @return Application Name
     * 
     */
    public Output<String> appName() {
        return this.appName;
    }

    /**
     * Application type.
     * - 1, general application.
     * - 2, k8s application.
     * 
     */
    @Import(name="appType")
    private @Nullable Output<Integer> appType;

    /**
     * @return Application type.
     * - 1, general application.
     * - 2, k8s application.
     * 
     */
    public Optional<Output<Integer>> appType() {
        return Optional.ofNullable(this.appType);
    }

    /**
     * Application Version, 1: Basic Edition, 2: Professional Edition
     * 
     */
    @Import(name="appVersion")
    private @Nullable Output<String> appVersion;

    /**
     * @return Application Version, 1: Basic Edition, 2: Professional Edition
     * 
     */
    public Optional<Output<String>> appVersion() {
        return Optional.ofNullable(this.appVersion);
    }

    /**
     * Whether to delete the task in the application Group. The values are as follows:
     * 
     */
    @Import(name="deleteJobs")
    private @Nullable Output<Boolean> deleteJobs;

    /**
     * @return Whether to delete the task in the application Group. The values are as follows:
     * 
     */
    public Optional<Output<Boolean>> deleteJobs() {
        return Optional.ofNullable(this.deleteJobs);
    }

    /**
     * Application Description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Application Description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to enable the log.
     * - true: On
     * - false: Close
     * 
     */
    @Import(name="enableLog")
    private @Nullable Output<Boolean> enableLog;

    /**
     * @return Whether to enable the log.
     * - true: On
     * - false: Close
     * 
     */
    public Optional<Output<Boolean>> enableLog() {
        return Optional.ofNullable(this.enableLog);
    }

    /**
     * Application ID
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return Application ID
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The maximum number of instances running at the same time. The default value is 1, that is, the last trigger is not completed, and the next trigger will not be performed even at the running time.
     * 
     */
    @Import(name="maxConcurrency")
    private @Nullable Output<Integer> maxConcurrency;

    /**
     * @return The maximum number of instances running at the same time. The default value is 1, that is, the last trigger is not completed, and the next trigger will not be performed even at the running time.
     * 
     */
    public Optional<Output<Integer>> maxConcurrency() {
        return Optional.ofNullable(this.maxConcurrency);
    }

    /**
     * Application Grouping Configurable Maximum Number of Tasks
     * 
     */
    @Import(name="maxJobs")
    private @Nullable Output<Integer> maxJobs;

    /**
     * @return Application Grouping Configurable Maximum Number of Tasks
     * 
     */
    public Optional<Output<Integer>> maxJobs() {
        return Optional.ofNullable(this.maxJobs);
    }

    /**
     * Alarm configuration JSON field. For more information about this field, see **Request Parameters * *.
     * 
     */
    @Import(name="monitorConfigJson")
    private @Nullable Output<String> monitorConfigJson;

    /**
     * @return Alarm configuration JSON field. For more information about this field, see **Request Parameters * *.
     * 
     */
    public Optional<Output<String>> monitorConfigJson() {
        return Optional.ofNullable(this.monitorConfigJson);
    }

    /**
     * Alarm contact JSON format.
     * 
     */
    @Import(name="monitorContactsJson")
    private @Nullable Output<String> monitorContactsJson;

    /**
     * @return Alarm contact JSON format.
     * 
     */
    public Optional<Output<String>> monitorContactsJson() {
        return Optional.ofNullable(this.monitorContactsJson);
    }

    /**
     * The namespace ID, which is obtained on the namespace page of the console.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The namespace ID, which is obtained on the namespace page of the console.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * The namespace name.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The namespace name.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Not supported for the time being, no need to fill in.
     * 
     */
    @Import(name="namespaceSource")
    private @Nullable Output<String> namespaceSource;

    /**
     * @return Not supported for the time being, no need to fill in.
     * 
     */
    public Optional<Output<String>> namespaceSource() {
        return Optional.ofNullable(this.namespaceSource);
    }

    /**
     * Whether to schedule a busy machine.
     * 
     */
    @Import(name="scheduleBusyWorkers")
    private @Nullable Output<Boolean> scheduleBusyWorkers;

    /**
     * @return Whether to schedule a busy machine.
     * 
     */
    public Optional<Output<Boolean>> scheduleBusyWorkers() {
        return Optional.ofNullable(this.scheduleBusyWorkers);
    }

    private AppGroupArgs() {}

    private AppGroupArgs(AppGroupArgs $) {
        this.appName = $.appName;
        this.appType = $.appType;
        this.appVersion = $.appVersion;
        this.deleteJobs = $.deleteJobs;
        this.description = $.description;
        this.enableLog = $.enableLog;
        this.groupId = $.groupId;
        this.maxConcurrency = $.maxConcurrency;
        this.maxJobs = $.maxJobs;
        this.monitorConfigJson = $.monitorConfigJson;
        this.monitorContactsJson = $.monitorContactsJson;
        this.namespace = $.namespace;
        this.namespaceName = $.namespaceName;
        this.namespaceSource = $.namespaceSource;
        this.scheduleBusyWorkers = $.scheduleBusyWorkers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppGroupArgs $;

        public Builder() {
            $ = new AppGroupArgs();
        }

        public Builder(AppGroupArgs defaults) {
            $ = new AppGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appName Application Name
         * 
         * @return builder
         * 
         */
        public Builder appName(Output<String> appName) {
            $.appName = appName;
            return this;
        }

        /**
         * @param appName Application Name
         * 
         * @return builder
         * 
         */
        public Builder appName(String appName) {
            return appName(Output.of(appName));
        }

        /**
         * @param appType Application type.
         * - 1, general application.
         * - 2, k8s application.
         * 
         * @return builder
         * 
         */
        public Builder appType(@Nullable Output<Integer> appType) {
            $.appType = appType;
            return this;
        }

        /**
         * @param appType Application type.
         * - 1, general application.
         * - 2, k8s application.
         * 
         * @return builder
         * 
         */
        public Builder appType(Integer appType) {
            return appType(Output.of(appType));
        }

        /**
         * @param appVersion Application Version, 1: Basic Edition, 2: Professional Edition
         * 
         * @return builder
         * 
         */
        public Builder appVersion(@Nullable Output<String> appVersion) {
            $.appVersion = appVersion;
            return this;
        }

        /**
         * @param appVersion Application Version, 1: Basic Edition, 2: Professional Edition
         * 
         * @return builder
         * 
         */
        public Builder appVersion(String appVersion) {
            return appVersion(Output.of(appVersion));
        }

        /**
         * @param deleteJobs Whether to delete the task in the application Group. The values are as follows:
         * 
         * @return builder
         * 
         */
        public Builder deleteJobs(@Nullable Output<Boolean> deleteJobs) {
            $.deleteJobs = deleteJobs;
            return this;
        }

        /**
         * @param deleteJobs Whether to delete the task in the application Group. The values are as follows:
         * 
         * @return builder
         * 
         */
        public Builder deleteJobs(Boolean deleteJobs) {
            return deleteJobs(Output.of(deleteJobs));
        }

        /**
         * @param description Application Description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Application Description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableLog Whether to enable the log.
         * - true: On
         * - false: Close
         * 
         * @return builder
         * 
         */
        public Builder enableLog(@Nullable Output<Boolean> enableLog) {
            $.enableLog = enableLog;
            return this;
        }

        /**
         * @param enableLog Whether to enable the log.
         * - true: On
         * - false: Close
         * 
         * @return builder
         * 
         */
        public Builder enableLog(Boolean enableLog) {
            return enableLog(Output.of(enableLog));
        }

        /**
         * @param groupId Application ID
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Application ID
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param maxConcurrency The maximum number of instances running at the same time. The default value is 1, that is, the last trigger is not completed, and the next trigger will not be performed even at the running time.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrency(@Nullable Output<Integer> maxConcurrency) {
            $.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * @param maxConcurrency The maximum number of instances running at the same time. The default value is 1, that is, the last trigger is not completed, and the next trigger will not be performed even at the running time.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            return maxConcurrency(Output.of(maxConcurrency));
        }

        /**
         * @param maxJobs Application Grouping Configurable Maximum Number of Tasks
         * 
         * @return builder
         * 
         */
        public Builder maxJobs(@Nullable Output<Integer> maxJobs) {
            $.maxJobs = maxJobs;
            return this;
        }

        /**
         * @param maxJobs Application Grouping Configurable Maximum Number of Tasks
         * 
         * @return builder
         * 
         */
        public Builder maxJobs(Integer maxJobs) {
            return maxJobs(Output.of(maxJobs));
        }

        /**
         * @param monitorConfigJson Alarm configuration JSON field. For more information about this field, see **Request Parameters * *.
         * 
         * @return builder
         * 
         */
        public Builder monitorConfigJson(@Nullable Output<String> monitorConfigJson) {
            $.monitorConfigJson = monitorConfigJson;
            return this;
        }

        /**
         * @param monitorConfigJson Alarm configuration JSON field. For more information about this field, see **Request Parameters * *.
         * 
         * @return builder
         * 
         */
        public Builder monitorConfigJson(String monitorConfigJson) {
            return monitorConfigJson(Output.of(monitorConfigJson));
        }

        /**
         * @param monitorContactsJson Alarm contact JSON format.
         * 
         * @return builder
         * 
         */
        public Builder monitorContactsJson(@Nullable Output<String> monitorContactsJson) {
            $.monitorContactsJson = monitorContactsJson;
            return this;
        }

        /**
         * @param monitorContactsJson Alarm contact JSON format.
         * 
         * @return builder
         * 
         */
        public Builder monitorContactsJson(String monitorContactsJson) {
            return monitorContactsJson(Output.of(monitorContactsJson));
        }

        /**
         * @param namespace The namespace ID, which is obtained on the namespace page of the console.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace ID, which is obtained on the namespace page of the console.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param namespaceName The namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param namespaceSource Not supported for the time being, no need to fill in.
         * 
         * @return builder
         * 
         */
        public Builder namespaceSource(@Nullable Output<String> namespaceSource) {
            $.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * @param namespaceSource Not supported for the time being, no need to fill in.
         * 
         * @return builder
         * 
         */
        public Builder namespaceSource(String namespaceSource) {
            return namespaceSource(Output.of(namespaceSource));
        }

        /**
         * @param scheduleBusyWorkers Whether to schedule a busy machine.
         * 
         * @return builder
         * 
         */
        public Builder scheduleBusyWorkers(@Nullable Output<Boolean> scheduleBusyWorkers) {
            $.scheduleBusyWorkers = scheduleBusyWorkers;
            return this;
        }

        /**
         * @param scheduleBusyWorkers Whether to schedule a busy machine.
         * 
         * @return builder
         * 
         */
        public Builder scheduleBusyWorkers(Boolean scheduleBusyWorkers) {
            return scheduleBusyWorkers(Output.of(scheduleBusyWorkers));
        }

        public AppGroupArgs build() {
            if ($.appName == null) {
                throw new MissingRequiredPropertyException("AppGroupArgs", "appName");
            }
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("AppGroupArgs", "groupId");
            }
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("AppGroupArgs", "namespace");
            }
            if ($.namespaceName == null) {
                throw new MissingRequiredPropertyException("AppGroupArgs", "namespaceName");
            }
            return $;
        }
    }

}