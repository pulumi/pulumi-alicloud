// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Compute.Outputs
{

    [OutputType]
    public sealed class GetNestServiceInstancesServiceInstanceServiceServiceInfoResult
    {
        /// <summary>
        /// The image of the service.
        /// </summary>
        public readonly string Image;
        /// <summary>
        /// The locale of the service.
        /// </summary>
        public readonly string Locale;
        /// <summary>
        /// The name of the service.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The short description of the service.
        /// </summary>
        public readonly string ShortDescription;

        [OutputConstructor]
        private GetNestServiceInstancesServiceInstanceServiceServiceInfoResult(
            string image,

            string locale,

            string name,

            string shortDescription)
        {
            Image = image;
            Locale = locale;
            Name = name;
            ShortDescription = shortDescription;
        }
    }
}