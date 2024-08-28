/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2024
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.oss.mediation.o1.api;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.cache.CacheDefinition;
import com.ericsson.oss.itpf.modeling.annotation.cache.CacheMode;

@EModel(description = "Node suspender cache for O1 Nodes", name = Constants.NODESUSPENDER_CACHE_NAME)
@CacheDefinition(cacheMode = CacheMode.REPLICATED_SYNC, keyClass = String.class, valueClass = Object.class)
public class O1NodeSuspenderCache {
}
