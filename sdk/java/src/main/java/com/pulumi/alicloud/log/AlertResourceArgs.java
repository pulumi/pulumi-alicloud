// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertResourceArgs Empty = new AlertResourceArgs();

    /**
     * The lang of alert center resource when type is user.
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The lang of alert center resource when type is user.
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * The project of alert resource when type is project.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project of alert resource when type is project.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The type of alert resources, must be user or project, &#39;user&#39; for init aliyuncloud account&#39;s alert center resource, including project named sls-alert-{uid}-{region} and some dashboards; &#39;project&#39; for init project&#39;s alert resource, including logstore named internal-alert-history and alert dashboard.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of alert resources, must be user or project, &#39;user&#39; for init aliyuncloud account&#39;s alert center resource, including project named sls-alert-{uid}-{region} and some dashboards; &#39;project&#39; for init project&#39;s alert resource, including logstore named internal-alert-history and alert dashboard.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AlertResourceArgs() {}

    private AlertResourceArgs(AlertResourceArgs $) {
        this.lang = $.lang;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertResourceArgs $;

        public Builder() {
            $ = new AlertResourceArgs();
        }

        public Builder(AlertResourceArgs defaults) {
            $ = new AlertResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lang The lang of alert center resource when type is user.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The lang of alert center resource when type is user.
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param project The project of alert resource when type is project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project of alert resource when type is project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param type The type of alert resources, must be user or project, &#39;user&#39; for init aliyuncloud account&#39;s alert center resource, including project named sls-alert-{uid}-{region} and some dashboards; &#39;project&#39; for init project&#39;s alert resource, including logstore named internal-alert-history and alert dashboard.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of alert resources, must be user or project, &#39;user&#39; for init aliyuncloud account&#39;s alert center resource, including project named sls-alert-{uid}-{region} and some dashboards; &#39;project&#39; for init project&#39;s alert resource, including logstore named internal-alert-history and alert dashboard.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AlertResourceArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AlertResourceArgs", "type");
            }
            return $;
        }
    }

}