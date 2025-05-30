// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectMemberRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectMemberRoleArgs Empty = new ProjectMemberRoleArgs();

    /**
     * Project Role Code.
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    /**
     * @return Project Role Code.
     * 
     */
    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * project role name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return project role name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * project role type
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return project role type
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ProjectMemberRoleArgs() {}

    private ProjectMemberRoleArgs(ProjectMemberRoleArgs $) {
        this.code = $.code;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectMemberRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectMemberRoleArgs $;

        public Builder() {
            $ = new ProjectMemberRoleArgs();
        }

        public Builder(ProjectMemberRoleArgs defaults) {
            $ = new ProjectMemberRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Project Role Code.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code Project Role Code.
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        /**
         * @param name project role name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name project role name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type project role type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type project role type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProjectMemberRoleArgs build() {
            return $;
        }
    }

}
