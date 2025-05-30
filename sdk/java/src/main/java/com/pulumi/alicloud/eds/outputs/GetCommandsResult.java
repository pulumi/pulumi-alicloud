// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.alicloud.eds.outputs.GetCommandsCommand;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCommandsResult {
    private @Nullable String commandType;
    private List<GetCommandsCommand> commands;
    private @Nullable String contentEncoding;
    private @Nullable String desktopId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String outputFile;
    private @Nullable String status;

    private GetCommandsResult() {}
    public Optional<String> commandType() {
        return Optional.ofNullable(this.commandType);
    }
    public List<GetCommandsCommand> commands() {
        return this.commands;
    }
    public Optional<String> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }
    public Optional<String> desktopId() {
        return Optional.ofNullable(this.desktopId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommandsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String commandType;
        private List<GetCommandsCommand> commands;
        private @Nullable String contentEncoding;
        private @Nullable String desktopId;
        private String id;
        private List<String> ids;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetCommandsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandType = defaults.commandType;
    	      this.commands = defaults.commands;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.desktopId = defaults.desktopId;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder commandType(@Nullable String commandType) {

            this.commandType = commandType;
            return this;
        }
        @CustomType.Setter
        public Builder commands(List<GetCommandsCommand> commands) {
            if (commands == null) {
              throw new MissingRequiredPropertyException("GetCommandsResult", "commands");
            }
            this.commands = commands;
            return this;
        }
        public Builder commands(GetCommandsCommand... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder contentEncoding(@Nullable String contentEncoding) {

            this.contentEncoding = contentEncoding;
            return this;
        }
        @CustomType.Setter
        public Builder desktopId(@Nullable String desktopId) {

            this.desktopId = desktopId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCommandsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetCommandsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetCommandsResult build() {
            final var _resultValue = new GetCommandsResult();
            _resultValue.commandType = commandType;
            _resultValue.commands = commands;
            _resultValue.contentEncoding = contentEncoding;
            _resultValue.desktopId = desktopId;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
