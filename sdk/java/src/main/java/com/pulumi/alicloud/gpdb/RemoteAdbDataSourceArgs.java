// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RemoteAdbDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RemoteAdbDataSourceArgs Empty = new RemoteAdbDataSourceArgs();

    /**
     * Data Source Name
     * 
     */
    @Import(name="dataSourceName")
    private @Nullable Output<String> dataSourceName;

    /**
     * @return Data Source Name
     * 
     */
    public Optional<Output<String>> dataSourceName() {
        return Optional.ofNullable(this.dataSourceName);
    }

    /**
     * The database of the local instance which connection data.
     * 
     */
    @Import(name="localDatabase", required=true)
    private Output<String> localDatabase;

    /**
     * @return The database of the local instance which connection data.
     * 
     */
    public Output<String> localDatabase() {
        return this.localDatabase;
    }

    /**
     * The instanceId of the local instance which connection data.
     * 
     */
    @Import(name="localDbInstanceId", required=true)
    private Output<String> localDbInstanceId;

    /**
     * @return The instanceId of the local instance which connection data.
     * 
     */
    public Output<String> localDbInstanceId() {
        return this.localDbInstanceId;
    }

    /**
     * The Management user name of the local instance.
     * 
     */
    @Import(name="managerUserName", required=true)
    private Output<String> managerUserName;

    /**
     * @return The Management user name of the local instance.
     * 
     */
    public Output<String> managerUserName() {
        return this.managerUserName;
    }

    /**
     * Password of the Manager user of the local instance
     * 
     */
    @Import(name="managerUserPassword", required=true)
    private Output<String> managerUserPassword;

    /**
     * @return Password of the Manager user of the local instance
     * 
     */
    public Output<String> managerUserPassword() {
        return this.managerUserPassword;
    }

    /**
     * The database of the remote instance which provide data.
     * 
     */
    @Import(name="remoteDatabase", required=true)
    private Output<String> remoteDatabase;

    /**
     * @return The database of the remote instance which provide data.
     * 
     */
    public Output<String> remoteDatabase() {
        return this.remoteDatabase;
    }

    /**
     * The instanceId of the remote instance which provide data.
     * 
     */
    @Import(name="remoteDbInstanceId", required=true)
    private Output<String> remoteDbInstanceId;

    /**
     * @return The instanceId of the remote instance which provide data.
     * 
     */
    public Output<String> remoteDbInstanceId() {
        return this.remoteDbInstanceId;
    }

    /**
     * The user name used to connect to the remote instance
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return The user name used to connect to the remote instance
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     * The user password used to connect to the remote instance
     * 
     */
    @Import(name="userPassword", required=true)
    private Output<String> userPassword;

    /**
     * @return The user password used to connect to the remote instance
     * 
     */
    public Output<String> userPassword() {
        return this.userPassword;
    }

    private RemoteAdbDataSourceArgs() {}

    private RemoteAdbDataSourceArgs(RemoteAdbDataSourceArgs $) {
        this.dataSourceName = $.dataSourceName;
        this.localDatabase = $.localDatabase;
        this.localDbInstanceId = $.localDbInstanceId;
        this.managerUserName = $.managerUserName;
        this.managerUserPassword = $.managerUserPassword;
        this.remoteDatabase = $.remoteDatabase;
        this.remoteDbInstanceId = $.remoteDbInstanceId;
        this.userName = $.userName;
        this.userPassword = $.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RemoteAdbDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RemoteAdbDataSourceArgs $;

        public Builder() {
            $ = new RemoteAdbDataSourceArgs();
        }

        public Builder(RemoteAdbDataSourceArgs defaults) {
            $ = new RemoteAdbDataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSourceName Data Source Name
         * 
         * @return builder
         * 
         */
        public Builder dataSourceName(@Nullable Output<String> dataSourceName) {
            $.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * @param dataSourceName Data Source Name
         * 
         * @return builder
         * 
         */
        public Builder dataSourceName(String dataSourceName) {
            return dataSourceName(Output.of(dataSourceName));
        }

        /**
         * @param localDatabase The database of the local instance which connection data.
         * 
         * @return builder
         * 
         */
        public Builder localDatabase(Output<String> localDatabase) {
            $.localDatabase = localDatabase;
            return this;
        }

        /**
         * @param localDatabase The database of the local instance which connection data.
         * 
         * @return builder
         * 
         */
        public Builder localDatabase(String localDatabase) {
            return localDatabase(Output.of(localDatabase));
        }

        /**
         * @param localDbInstanceId The instanceId of the local instance which connection data.
         * 
         * @return builder
         * 
         */
        public Builder localDbInstanceId(Output<String> localDbInstanceId) {
            $.localDbInstanceId = localDbInstanceId;
            return this;
        }

        /**
         * @param localDbInstanceId The instanceId of the local instance which connection data.
         * 
         * @return builder
         * 
         */
        public Builder localDbInstanceId(String localDbInstanceId) {
            return localDbInstanceId(Output.of(localDbInstanceId));
        }

        /**
         * @param managerUserName The Management user name of the local instance.
         * 
         * @return builder
         * 
         */
        public Builder managerUserName(Output<String> managerUserName) {
            $.managerUserName = managerUserName;
            return this;
        }

        /**
         * @param managerUserName The Management user name of the local instance.
         * 
         * @return builder
         * 
         */
        public Builder managerUserName(String managerUserName) {
            return managerUserName(Output.of(managerUserName));
        }

        /**
         * @param managerUserPassword Password of the Manager user of the local instance
         * 
         * @return builder
         * 
         */
        public Builder managerUserPassword(Output<String> managerUserPassword) {
            $.managerUserPassword = managerUserPassword;
            return this;
        }

        /**
         * @param managerUserPassword Password of the Manager user of the local instance
         * 
         * @return builder
         * 
         */
        public Builder managerUserPassword(String managerUserPassword) {
            return managerUserPassword(Output.of(managerUserPassword));
        }

        /**
         * @param remoteDatabase The database of the remote instance which provide data.
         * 
         * @return builder
         * 
         */
        public Builder remoteDatabase(Output<String> remoteDatabase) {
            $.remoteDatabase = remoteDatabase;
            return this;
        }

        /**
         * @param remoteDatabase The database of the remote instance which provide data.
         * 
         * @return builder
         * 
         */
        public Builder remoteDatabase(String remoteDatabase) {
            return remoteDatabase(Output.of(remoteDatabase));
        }

        /**
         * @param remoteDbInstanceId The instanceId of the remote instance which provide data.
         * 
         * @return builder
         * 
         */
        public Builder remoteDbInstanceId(Output<String> remoteDbInstanceId) {
            $.remoteDbInstanceId = remoteDbInstanceId;
            return this;
        }

        /**
         * @param remoteDbInstanceId The instanceId of the remote instance which provide data.
         * 
         * @return builder
         * 
         */
        public Builder remoteDbInstanceId(String remoteDbInstanceId) {
            return remoteDbInstanceId(Output.of(remoteDbInstanceId));
        }

        /**
         * @param userName The user name used to connect to the remote instance
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The user name used to connect to the remote instance
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param userPassword The user password used to connect to the remote instance
         * 
         * @return builder
         * 
         */
        public Builder userPassword(Output<String> userPassword) {
            $.userPassword = userPassword;
            return this;
        }

        /**
         * @param userPassword The user password used to connect to the remote instance
         * 
         * @return builder
         * 
         */
        public Builder userPassword(String userPassword) {
            return userPassword(Output.of(userPassword));
        }

        public RemoteAdbDataSourceArgs build() {
            if ($.localDatabase == null) {
                throw new MissingRequiredPropertyException("RemoteAdbDataSourceArgs", "localDatabase");
            }
            if ($.localDbInstanceId == null) {
                throw new MissingRequiredPropertyException("RemoteAdbDataSourceArgs", "localDbInstanceId");
            }
            if ($.managerUserName == null) {
                throw new MissingRequiredPropertyException("RemoteAdbDataSourceArgs", "managerUserName");
            }
            if ($.managerUserPassword == null) {
                throw new MissingRequiredPropertyException("RemoteAdbDataSourceArgs", "managerUserPassword");
            }
            if ($.remoteDatabase == null) {
                throw new MissingRequiredPropertyException("RemoteAdbDataSourceArgs", "remoteDatabase");
            }
            if ($.remoteDbInstanceId == null) {
                throw new MissingRequiredPropertyException("RemoteAdbDataSourceArgs", "remoteDbInstanceId");
            }
            if ($.userName == null) {
                throw new MissingRequiredPropertyException("RemoteAdbDataSourceArgs", "userName");
            }
            if ($.userPassword == null) {
                throw new MissingRequiredPropertyException("RemoteAdbDataSourceArgs", "userPassword");
            }
            return $;
        }
    }

}